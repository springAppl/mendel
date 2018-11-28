package pvt.lee.spring.instant;

public class ItemFactory {
    public static Item create(){
        Item item = new Item();
        item.setMethod("factory");
        return item;
    }
}
