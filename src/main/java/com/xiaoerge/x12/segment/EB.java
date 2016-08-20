package com.xiaoerge.x12.segment;

import com.xiaoerge.x12.annotation.Declaration;
import com.xiaoerge.x12.annotation.Definition;

/**
 * Created by xiaoerge on 5/23/16.
 */
@Declaration(fieldSize = 14, name = "EB")
public class EB extends Segment {
    public EB() { super(); }
    public EB(String content) {
        super(content);
    }

    @Definition(position = 1, minLength = 1, maxLength = 2)
    public String getEligibilityOrBenefitInformationCode() { return getByPosition(); }

    @Definition(position = 2, minLength = 3, maxLength = 3)
    public String getCoverageLevelCode() { return getByPosition(); }

    @Definition(position = 3, minLength = 1, maxLength = 2)
    public String getServiceTypeCode() { return getByPosition(); }

    @Definition(position = 4, minLength = 1, maxLength = 3)
    public String getInsuranceTypeCode() { return getByPosition(); }

    @Definition(position = 5, minLength = 1, maxLength = 50)
    public String getPlanCoverageDescription() { return getByPosition(); }

    @Definition(position = 6, minLength = 1, maxLength = 2)
    public String getTimePeriodQualifier() { return getByPosition(); }

    @Definition(position = 7, minLength = 1, maxLength = 18)
    public String getMonetaryAmount() { return getByPosition(); }

    @Definition(position = 8, minLength = 1, maxLength = 10)
    public String getPercentageAsDecimal() { return getByPosition(); }

    @Definition(position = 9, minLength = 2, maxLength = 2)
    public String getQuantityQualifier() { return getByPosition(); }

    @Definition(position = 10, minLength = 1, maxLength = 15)
    public String getQuantity() { return getByPosition(); }

    @Definition(position = 11, minLength = 1, maxLength = 1)
    public String getYesNoConditionOrResponseCode() { return getByPosition(); }

    @Definition(position = 12, minLength = 1, maxLength = 1)
    public String getYesNoConditionOrResponseCode2() { return getByPosition(); }

    @Definition(position = 13, minLength = 13, maxLength = 186)
    public String getCompositeMedicalProcedureIdentifier() { return getByPosition(); }

    @Definition(position = 14, minLength = 4, maxLength = 8)
    public String getCompositeDiagnosisCodePointer() { return getByPosition(); }

    public void setEligibilityOrBenefitInformationCode(String s) {collection[1] = s;}
    public void setCoverageLevelCode(String s) {collection[2] = s;}
    public void setServiceTypeCode(String s) {collection[3] = s;}
    public void setInsuranceTypeCode(String s) {collection[4] = s;}
    public void setPlanCoverageDescription(String s) {collection[5] = s;}
    public void setTimePeriodQualifier(String s) {collection[6] = s;}
    public void setMonetaryAmount(String s) {collection[7] = s;}
    public void setPercentageAsDecimal(String s) {collection[8] = s;}
    public void setQuantityQualifier(String s) {collection[9] = s;}
    public void setQuantity(String s) {collection[10] = s;}
    public void setYesNoConditionOrResponseCode(String s) {collection[11] = s;}
    public void setYesNoConditionOrResponseCode2(String s) {collection[12] = s;}
    public void setCompositeMedicalProcedureIdentifier(String s) {collection[13] = s;}
    public void setCompositeDiagnosisCodePointer(String s) {collection[14] = s;}
}