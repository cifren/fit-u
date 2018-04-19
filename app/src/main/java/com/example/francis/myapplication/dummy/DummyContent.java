package com.example.francis.myapplication.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(
            String.valueOf(position),
            "Item title " + position,
            makedescription(position),
            "abdo",
            "bench"
        );
    }

    private static String makedescription(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("description about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore description information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of title.
     */
    public static class DummyItem {
        public final String id;
        public final String title;
        public final String description;
        public final String musclePart;
        public final String accessories;

        public DummyItem(String id, String title, String description, String musclePart, String accessories) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.musclePart = musclePart;
            this.accessories = accessories;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
