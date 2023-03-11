package IO;

import java.io.*;
import java.util.*;

public class Less445 {
    public static class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " hehe";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }


    public static Animal[] deserializeAnimalArray(byte[] data) {
        ByteArrayInputStream bArrayIS = new ByteArrayInputStream(data);

        try(ObjectInputStream objectIntputStream = new ObjectInputStream(bArrayIS)) {
            int size = objectIntputStream.readInt();
            System.out.println(size);
            Animal[] animals = new Animal[size];
            for (int i = 0; i < size; i++) {
                animals[i] = (Animal) objectIntputStream.readObject();
                System.out.println(animals[i].toString());
            }
            return animals;
        } catch (IllegalArgumentException | IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        } catch (Exception ex) {
            throw new IllegalArgumentException();
        }

    }

    public static byte[] serializeAnimalArray (Animal[] animals) {
        ByteArrayOutputStream bArrayOS = new ByteArrayOutputStream();
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(bArrayOS)){
            objectOutputStream.writeInt(animals.length);
            for (int i = 0; i < animals.length; i++) {
                objectOutputStream.writeObject(animals[i]);
            }
            objectOutputStream.flush();
            objectOutputStream.close();
            return bArrayOS.toByteArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Animal cat = new Animal("kotik");
        Animal dog = new Animal("pesik");
        Animal[] animals = {cat, dog};

        byte[] bArray = {-84, -19, 0, 5, 123, 4, 123, 0, 0, 2, 90, 114, 0, 17, 73, 79, 46, 76, 101, 115, 115, 52, 52, 53, 36, 65, 110, 105, 109, 97, 108, 68, -37, -32, -48, 127, -62, -78, 40, 2, 0, 1, 76, 0, 4, 110, 97, 109, 101, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 120, 112, 116, 0, 5, 107, 111, 116, 105, 107, 115, 113, 0, 126, 0, 0, 116, 0, 5, 112, 101, 115, 105, 107};

//        System.out.println(serializeAnimalArray(animals));
        System.out.println(Arrays.toString(serializeAnimalArray(animals)));
        System.out.println(Arrays.toString(deserializeAnimalArray(bArray)));

    }
}
