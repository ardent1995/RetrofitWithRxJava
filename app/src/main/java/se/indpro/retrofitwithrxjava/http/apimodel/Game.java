
package se.indpro.retrofitwithrxjava.http.apimodel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Game {

    @SerializedName("box")
    private Box mBox;
    @SerializedName("giantbomb_id")
    private Long mGiantbombId;
    @SerializedName("locale")
    private String mLocale;
    @SerializedName("localized_name")
    private String mLocalizedName;
    @SerializedName("logo")
    private Logo mLogo;
    @SerializedName("name")
    private String mName;
    @SerializedName("popularity")
    private Long mPopularity;
    @SerializedName("_id")
    private Long m_id;
    @SerializedName("_links")
    private se.indpro.retrofitwithrxjava.http.apimodel._links m_links;

    public Box getBox() {
        return mBox;
    }

    public void setBox(Box box) {
        mBox = box;
    }

    public Long getGiantbombId() {
        return mGiantbombId;
    }

    public void setGiantbombId(Long giantbombId) {
        mGiantbombId = giantbombId;
    }

    public String getLocale() {
        return mLocale;
    }

    public void setLocale(String locale) {
        mLocale = locale;
    }

    public String getLocalizedName() {
        return mLocalizedName;
    }

    public void setLocalizedName(String localizedName) {
        mLocalizedName = localizedName;
    }

    public Logo getLogo() {
        return mLogo;
    }

    public void setLogo(Logo logo) {
        mLogo = logo;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getPopularity() {
        return mPopularity;
    }

    public void setPopularity(Long popularity) {
        mPopularity = popularity;
    }

    public Long get_id() {
        return m_id;
    }

    public void set_id(Long _id) {
        m_id = _id;
    }

    public se.indpro.retrofitwithrxjava.http.apimodel._links get_links() {
        return m_links;
    }

    public void set_links(se.indpro.retrofitwithrxjava.http.apimodel._links _links) {
        m_links = _links;
    }

}
