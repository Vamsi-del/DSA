package com.objectOriented;

public class InsideObject {
    ItemData data;
    InsideObject next;
    InsideObject[] array = new InsideObject[10];
    int j;

    public InsideObject(ItemData itemData, InsideObject insideObject) {
        this.data = itemData;
        this.next = insideObject;
    }

    public InsideObject() {

    }

    public void save(InsideObject insideObject){
        array[j] = insideObject;
        System.out.println(array[j].data.i+"  "+array[j].data.i1+"  "+array[j].next);
    }
}
