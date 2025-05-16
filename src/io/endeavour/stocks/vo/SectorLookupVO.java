package io.endeavour.stocks.vo;

import java.util.Comparator;
import java.util.Objects;

public class SectorLookupVO implements Comparable<SectorLookupVO> {
    private Integer sectorId;
    private String sectorName;

    public SectorLookupVO(Integer sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public Integer getSectorId() {
        return sectorId;
    }
    public String getSectorName() {
        return sectorName;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SectorLookupVO that = (SectorLookupVO) o;
        return Objects.equals(sectorId, that.sectorId) && Objects.equals(sectorName, that.sectorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectorId, sectorName);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SectorLookupVO{");
        sb.append("sectorId=").append(sectorId);
        sb.append(", sectorName='").append(sectorName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(SectorLookupVO o) {
        return this.sectorName.compareTo(o.getSectorName());
    }
}

