package com.Google;

public class UnicodeFilter implements Filter {
    public String value;

    UnicodeFilter(String value){
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void doFilter() {
        char[] arr = value.toCharArray();

        for(int i=0;i<value.length();i++){
            Integer.toHexString(arr[i]);
        }

        String x;
        for(int j=0; j<arr.length;j++){
            x = "\\u"+ arr[j];
            value += x;
        }


    }
}
