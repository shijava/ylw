package com.myit.ylw.pojo;

public class DesignWorksWithBLOBs extends DesignWorks {
    private String title;

    private String details;

    private String smallpic;

    public DesignWorksWithBLOBs(Integer designworksid, Integer userid, Integer category, Integer casestyle, Double price, Integer pricerange, Integer listid, Integer isrecommend, Date addtime, Date edittime, Integer adminid, Integer isclose, Integer initisclose, Integer isputaway, Integer clicknum, Integer salesvolume, String title, String details, String smallpic) {
        super(designworksid, userid, category, casestyle, price, pricerange, listid, isrecommend, addtime, edittime, adminid, isclose, initisclose, isputaway, clicknum, salesvolume);
        this.title = title;
        this.details = details;
        this.smallpic = smallpic;
    }

    public DesignWorksWithBLOBs() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(String smallpic) {
        this.smallpic = smallpic == null ? null : smallpic.trim();
    }
}