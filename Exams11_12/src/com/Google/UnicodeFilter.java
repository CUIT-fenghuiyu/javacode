package com.Google;

class UnicodeFilter implements Filter
{

    private String value;
    public UnicodeFilter(String value)
    {
        this.value=value;
    }

    @Override
    public void doFilter() {
        String b="";
        for(int i=0;i<value.length();i++)
        {
            b+="\\u"+Integer.toHexString(value.charAt(i));

        }
        value=b;
        // TODO Auto-generated method stub

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
