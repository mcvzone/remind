package jw.developer.com.remind.model;

/**
 * Created by neo on 2018-02-19.
 */

public class MainListItem {
    private String itemName;
    private String packageName;
    private String className;

    public MainListItem(String itemName, String packageName, String className) {
        this.itemName = itemName;
        this.packageName = packageName;
        this.className = className;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
