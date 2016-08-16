package com.xiaoerge.ediparser.x12.segment;

import com.xiaoerge.ediparser.x12.annotation.Definition;
import com.xiaoerge.ediparser.x12.annotation.Declaration;

/**
 * Created by xiaoerge on 5/23/16.
 */
@Declaration(fieldSize = 12, name = "HI")
public class HI extends Segment {
    public HI() { super(); }
    public HI(String content) {
        super(content);
    }

    @Definition(position = 1, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation1() { return getByDefinition(); }

    @Definition(position = 2, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation2() { return getByDefinition(); }

    @Definition(position = 3, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation3() { return getByDefinition(); }

    @Definition(position = 4, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation4() { return getByDefinition(); }

    @Definition(position = 5, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation5() { return getByDefinition(); }

    @Definition(position = 6, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation6() { return getByDefinition(); }

    @Definition(position = 7, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation7() { return getByDefinition(); }

    @Definition(position = 8, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation8() { return getByDefinition(); }

    @Definition(position = 9, minLength = 1, maxLength = 1)
    public String getHealthCareCodeInformation9() { return getByDefinition(); }

    @Definition(position = 10, minLength = 1, maxLength = 13)
    public String getHealthCareCodeInformation10() { return getByDefinition(); }

    @Definition(position = 11, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation11() { return getByDefinition(); }

    @Definition(position = 12, minLength = 1, maxLength = 30)
    public String getHealthCareCodeInformation12() { return getByDefinition(); }

    public void setHealthCareCodeInformation1(String s) { collection[1] = s; }
    public void setHealthCareCodeInformation2(String s) { collection[2] = s; }
    public void setHealthCareCodeInformation3(String s) { collection[3] = s; }
    public void setHealthCareCodeInformation4(String s) { collection[4] = s; }
    public void setHealthCareCodeInformation5(String s) { collection[5] = s; }
    public void setHealthCareCodeInformation6(String s) { collection[6] = s; }
    public void setHealthCareCodeInformation7(String s) { collection[7] = s; }
    public void setHealthCareCodeInformation8(String s) { collection[8] = s; }
    public void setHealthCareCodeInformation9(String s) { collection[9] = s; }
    public void setHealthCareCodeInformation10(String s) { collection[10] = s; }
    public void setHealthCareCodeInformation11(String s) { collection[11] = s; }
    public void setHealthCareCodeInformation12(String s) { collection[12] = s; }
}