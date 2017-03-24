package cn.ssm.po;

public class Physical {
    private Integer phyId;

    private String phyName;

    private String phyMemory;

    private String phyDisk;

    public Integer getPhyId() {
        return phyId;
    }

    public void setPhyId(Integer phyId) {
        this.phyId = phyId;
    }

    public String getPhyName() {
        return phyName;
    }

    public void setPhyName(String phyName) {
        this.phyName = phyName == null ? null : phyName.trim();
    }

    public String getPhyMemory() {
        return phyMemory;
    }

    public void setPhyMemory(String phyMemory) {
        this.phyMemory = phyMemory == null ? null : phyMemory.trim();
    }

    public String getPhyDisk() {
        return phyDisk;
    }

    public void setPhyDisk(String phyDisk) {
        this.phyDisk = phyDisk == null ? null : phyDisk.trim();
    }
}