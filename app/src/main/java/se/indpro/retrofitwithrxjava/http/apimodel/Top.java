
package se.indpro.retrofitwithrxjava.http.apimodel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Top {

    @SerializedName("channels")
    private Long mChannels;
    @SerializedName("game")
    private Game mGame;
    @SerializedName("viewers")
    private Long mViewers;

    public Long getChannels() {
        return mChannels;
    }

    public void setChannels(Long channels) {
        mChannels = channels;
    }

    public Game getGame() {
        return mGame;
    }

    public void setGame(Game game) {
        mGame = game;
    }

    public Long getViewers() {
        return mViewers;
    }

    public void setViewers(Long viewers) {
        mViewers = viewers;
    }

}
