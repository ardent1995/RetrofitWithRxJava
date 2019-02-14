package se.indpro.retrofitwithrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import se.indpro.retrofitwithrxjava.http.TwitchAPI;
import se.indpro.retrofitwithrxjava.http.apimodel.Top;
import se.indpro.retrofitwithrxjava.http.apimodel.Twitch;
import se.indpro.retrofitwithrxjava.root.App;

public class MainActivity extends AppCompatActivity {

    @Inject
    TwitchAPI twitchAPI;

    private static final String CLIENT_ID = "edu5pdko4byti56y2cavs6zk3bqh9f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).getComponent().inject(this);

        Call<Twitch> call = twitchAPI.getTopGames(CLIENT_ID);
        call.enqueue(new Callback<Twitch>() {
            @Override
            public void onResponse(Call<Twitch> call, Response<Twitch> response) {
                List<Top> gameList = response.body().getTop();
                for(Top top: gameList){
                    System.out.println(top.getGame().getName());
                }
            }

            @Override
            public void onFailure(Call<Twitch> call, Throwable t) {
                t.printStackTrace();
            }
        });

        twitchAPI.getTopGamesObservable(CLIENT_ID)
                .flatMap(new Function<Twitch, Observable<Top>>() {
                    @Override
                    public Observable<Top> apply(Twitch twitch) throws Exception {
                        return Observable.fromIterable(twitch.getTop());
                    }
                })
                .flatMap(new Function<Top, Observable<String>>() {
                    @Override
                    public Observable<String> apply(Top top) throws Exception {
                        return Observable.just(top.getGame().getName());
                    }
                }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println("From RxJava: "+ s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}
