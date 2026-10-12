// TODO: Import Item and Inventory from game.inventory

import game.inventory.Inventory;
import  game.inventory.Item;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // TODO: Create 3 Item objects and add them to the inventory
        // Suggested items:
        //   "Galaxy Racer",  "Racing",  12 units, serial "GR-4421"
        //   "Shadow Realm",  "RPG",      5 units, serial "SR-8873"
        //   "Pixel Legends", "Strategy", 3 units, serial "PL-0091"
        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");
        Inventory shop1 = new Inventory();
        shop1.addItem(item1);
        shop1.addItem(item2);
        shop1.addItem(item3);
        // TODO: Call displayAll()
        shop1.displayAll();
        System.out.println();

        // TODO: Sell some copies:
        //   Sell 4 copies of "Galaxy Racer"
        //   Sell 6 copies of "Shadow Realm" (should trigger warning — only 5 in stock)
        item1.sell(4);
        item2.sell(6);

        System.out.println();

        // TODO: Call displayAll() again to show updated stock
        shop1.displayAll();

        System.out.println();

        // TODO: Call auditSerialCodes()
        shop1.auditSerialCodes();
        // TODO: Try calling getSerialCode() directly from here — it should FAIL to compile.
        //       Leave this as a COMMENT explaining why it doesn't work:
        // System.out.println(item.getSerialCode()); // WHY does this fail?
        /*
        * It can only be used in a package where it belongs to.
        * Since it does not have any access modifiers (like public or private), it cannot be seen outside of the package.
         */
    }
}
