package College.OOP.LivingBeingExample;

import java.util.Objects;

public class Lion extends Animal {
   public Lion(String name) {
       super(name);
   }

   LionType type;

   public String getDetails() {
       if (Objects.requireNonNull(type) == LionType.PRINCE_LION) {
           return "My name is " + name + " and I am a " + "Prince";
       }
       if(type == LionType.KING_LION) {
           return "My name is " + name + " and I am a " + "King";
       }
       return "My name is " + name + " and I am a " + type.toString();
   }
}
