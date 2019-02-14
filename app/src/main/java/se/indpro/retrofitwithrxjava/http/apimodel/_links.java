
package se.indpro.retrofitwithrxjava.http.apimodel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class _links {

    @SerializedName("next")
    private String mNext;
    @SerializedName("self")
    private String mSelf;

    public String getNext() {
        return mNext;
    }

    public void setNext(String next) {
        mNext = next;
    }

    public String getSelf() {
        return mSelf;
    }

    public void setSelf(String self) {
        mSelf = self;
    }

}
