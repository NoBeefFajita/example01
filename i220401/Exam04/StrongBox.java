package example01.i220401.Exam04;

import java.util.HashMap;

public class StrongBox {
    private HashMap<String,Treasure> treasure;

    public StrongBox() {
        treasure = new HashMap<>();
    }

    public void store(String secret,Treasure treasure) throws DuplicateSecretException{
        if(this.treasure.containsKey(secret)) {
            throw new DuplicateSecretException();
        } else {
            System.out.println(treasure + "를 금고에 저장했습니다!");
            this.treasure.put(secret,treasure);
        }
    }

    public Treasure getTreasure(String secret) throws IllegalSecretException{
        if(this.treasure.get(secret)==null)
            throw new IllegalSecretException();
        return this.treasure.get(secret);
    }
}
