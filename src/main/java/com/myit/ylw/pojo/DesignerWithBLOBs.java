package com.myit.ylw.pojo;

public class DesignerWithBLOBs extends Designer {
    private String bannerpic;

    private String description;

    public DesignerWithBLOBs(Integer designeerid, Integer userid, String specialty, Integer seniority, Date addtime, Date edittime, Integer isaudit, Integer isclose, Integer clicknum, Integer adminid, Integer listid, Integer isrecommend, String bannerpic, String description) {
        super(designeerid, userid, specialty, seniority, addtime, edittime, isaudit, isclose, clicknum, adminid, listid, isrecommend);
        this.bannerpic = bannerpic;
        this.description = description;
    }

    public DesignerWithBLOBs() {
        super();
    }

    public String getBannerpic() {
        return bannerpic;
    }

    public void setBannerpic(String bannerpic) {
        this.bannerpic = bannerpic == null ? null : bannerpic.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}