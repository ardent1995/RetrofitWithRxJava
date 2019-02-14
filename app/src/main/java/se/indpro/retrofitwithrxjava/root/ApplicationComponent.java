package se.indpro.retrofitwithrxjava.root;

import javax.inject.Singleton;

import dagger.Component;
import se.indpro.retrofitwithrxjava.MainActivity;
import se.indpro.retrofitwithrxjava.http.ApiModule;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

}
