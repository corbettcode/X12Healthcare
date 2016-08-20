package com.xiaoerge.x12.segment;

import com.xiaoerge.x12.annotation.Declaration;
import com.xiaoerge.x12.annotation.Definition;

/**
 * Created by xiaoerge on 8/13/16.
 */
@Declaration(fieldSize = 9, name = "PER")
public class PER extends Segment {
    public PER() { super(); }
    public PER(String content) {
        super(content);
    }

    @Definition(position = 1, minLength = 2, maxLength = 2)
    public String getContactFunctionCode() { return getByPosition(); }

    @Definition(position = 2, minLength = 1, maxLength = 60)
    public String getName() { return getByPosition(); }

    @Definition(position = 3, minLength = 2, maxLength = 2)
    public String getCommunicationNumberQualifier1() { return getByPosition(); }

    @Definition(position = 4, minLength = 1, maxLength = 256)
    public String getCommunicationNumber1() { return getByPosition(); }

    @Definition(position = 5, minLength = 2, maxLength = 2)
    public String getCommunicationNumberQualifier2() { return getByPosition(); }

    @Definition(position = 6, minLength = 1, maxLength = 256)
    public String getCommunicationNumber2() { return getByPosition(); }

    @Definition(position = 7, minLength = 2, maxLength = 2)
    public String getCommunicationNumberQualifier3() { return getByPosition(); }

    @Definition(position = 8, minLength = 1, maxLength = 256)
    public String getCommunicationNumber3() { return getByPosition(); }

    @Definition(position = 9, minLength = 1, maxLength = 20)
    public String getContactInquiryReference() { return getByPosition(); }

    public void setContactFunctionCode(String s) { collection[1] = s; }
    public void setName(String s) { collection[2] = s; }
    public void setCommunicationNumberQualifier1(String s) { collection[3] = s; }
    public void setCommunicationNumber1(String s) { collection[4] = s; }
    public void setCommunicationNumberQualifier2(String s) { collection[5] = s; }
    public void setCommunicationNumber2(String s) { collection[6] = s; }
    public void setCommunicationNumberQualifier3(String s) { collection[7] = s; }
    public void setCommunicationNumber3(String s) { collection[8] = s; }
    public void setContactInquiryReference(String s) { collection[9] = s; }
}