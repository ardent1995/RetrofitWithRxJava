
package se.indpro.retrofitwithrxjava.http.apimodel;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Twitch {

    @SerializedName("top")
    private List<Top> mTop;
    @SerializedName("_links")
    private se.indpro.retrofitwithrxjava.http.apimodel._links m_links;
    @SerializedName("_total")
    private Long m_total;

    public List<Top> getTop() {
        return mTop;
    }

    public void setTop(List<Top> top) {
        mTop = top;
    }

    public se.indpro.retrofitwithrxjava.http.apimodel._links get_links() {
        return m_links;
    }

    public void set_links(se.indpro.retrofitwithrxjava.http.apimodel._links _links) {
        m_links = _links;
    }

    public Long get_total() {
        return m_total;
    }

    public void set_total(Long _total) {
        m_total = _total;
    }

}
