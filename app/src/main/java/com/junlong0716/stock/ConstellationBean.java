package com.junlong0716.stock;

/**
 * @author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 上午9:14 2017/10/25
 * @Modified By:
 */
public class ConstellationBean {
    private String constellationName;
    private String constellationPic;

    public ConstellationBean(String constellationName, String constellationPic) {
        this.constellationName = constellationName;
        this.constellationPic = constellationPic;
    }

    public String getConstellationName() {
        return constellationName;
    }

    public void setConstellationName(String constellationName) {
        this.constellationName = constellationName;
    }

    public String getConstellationPic() {
        return constellationPic;
    }

    public void setConstellationPic(String constellationPic) {
        this.constellationPic = constellationPic;
    }
}
