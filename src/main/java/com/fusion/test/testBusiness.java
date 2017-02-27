package com.fusion.test;

import com.fusion.model.BusinessGroup;
import com.google.common.collect.Lists;

import java.util.List;

public class testBusiness {


    public static void main(StringTest[] args) {

        BusinessGroup businessGroup = new BusinessGroup();

        businessGroup.setLabel("1");

        List<BusinessGroup> list = Lists.newArrayList();
        BusinessGroup b = new BusinessGroup();
        b.setLabel("2");

        List<BusinessGroup> l = Lists.newArrayList();
        BusinessGroup c = new BusinessGroup();
        c.setLabel("3");
        b.setChildren(l);
        l.add(c);
        list.add(b);

        BusinessGroup d = new BusinessGroup();
        d.setLabel("4");
        list.add(d);

        businessGroup.setChildren(list);
        setGroupMonitor(businessGroup);
    }



    public static void setGroupMonitor(BusinessGroup businessGroup) {
        List<BusinessGroup> children = businessGroup.getChildren();
        for (BusinessGroup b : children){
            System.out.println(b.getLabel());

            List<BusinessGroup> bc = b.getChildren();
            if (bc == null ){
                continue;
            }
            setGroupMonitor(b);
        }
    }
}
