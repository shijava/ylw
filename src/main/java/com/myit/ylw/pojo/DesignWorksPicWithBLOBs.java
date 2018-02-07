package com.myit.ylw.pojo;

public class DesignWorksPicWithBLOBs extends DesignWorksPic {
    private String smallpic;

    private String bigpic;

    public DesignWorksPicWithBLOBs(Integer designworkspicid, Integer designworksid, Integer title, Integer listid, Integer adminid, Date addtime, Integer isclose, String smallpic, String bigpic) {
        super(designworkspicid, designworksid, title, listid, adminid, addtime, isclose);
        this.smallpic = smallpic;
        this.bigpic = bigpic;
    }

    public DesignWorksPicWithBLOBs() {
        super();
    }

    public String getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(String smallpic) {
        this.smallpic = smallpic == null ? null : smallpic.trim();
    }

    public String getBigpic() {
        return bigpic;
    }

    public void setBigpic(String bigpic) {
        this.bigpic = bigpic == null ? null : bigpic.trim();
    }
}