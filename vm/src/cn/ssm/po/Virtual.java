package cn.ssm.po;

public class Virtual {
    private Integer virId;

    private String virName;

    private String virMemory;

    private String virDisk;

    private Integer userId;

    private Integer phyId;

    public Integer getVirId() {
        return virId;
    }

    public void setVirId(Integer virId) {
        this.virId = virId;
    }

    public String getVirName() {
        return virName;
    }

    public void setVirName(String virName) {
        this.virName = virName == null ? null : virName.trim();
    }

    public String getVirMemory() {
        return virMemory;
    }

    public void setVirMemory(String virMemory) {
        this.virMemory = virMemory == null ? null : virMemory.trim();
    }

    public String getVirDisk() {
        return virDisk;
    }

    public void setVirDisk(String virDisk) {
        this.virDisk = virDisk == null ? null : virDisk.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPhyId() {
        return phyId;
    }

    public void setPhyId(Integer phyId) {
        this.phyId = phyId;
    }
}