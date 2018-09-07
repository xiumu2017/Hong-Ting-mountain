

package org.jtm.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 理解数组中的引用类型
 */
public class ListUtil {
    public static void main(String[] args) {
        List<Entity> list = new ArrayList<>();

        Entity e1 = new Entity();
        e1.setId("1");
        e1.setName("n1");

        list.add(e1);

        Entity e2 = new Entity();
        e2.setName("e2");
        e2.setId("2");

        list.add(e2);

        List<Entity> entities = new ArrayList<>();

        for (Entity entity : list) {
            if (entity.getId().equals("1")) {
                entities.add(entity);
            }
        }

//        System.out.println(entities.get(0).equals(list.get(0)));
//        System.out.println(entities.get(0).equals(e1));

        for (Entity entity : list) {
            if (entity.getId().equals("1")) {
                System.out.println(e1.equals(entity));
                System.out.println(list.remove(e1));
            }
        }


    }
}
