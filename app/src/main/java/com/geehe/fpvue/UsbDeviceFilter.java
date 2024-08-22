package com.geehe.fpvue;

public class UsbDeviceFilter {
    public int vendorId;
    public int productId;

    public UsbDeviceFilter(int vid, int pid) {
        vendorId = vid;
        productId = pid;
    }
}
