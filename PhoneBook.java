package JavaCore2022.lesson_4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phonebook_hm = new HashMap<>();
    private ArrayList<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (phonebook_hm.containsKey(surname)) {
            phone_number_list = phonebook_hm.get(surname);
            phone_number_list.add(phone_number);
            phonebook_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            phonebook_hm.put(surname, phone_number_list);
        }
    }

    public ArrayList<String> get(String surname) {
        return phonebook_hm.get(surname);
    }
        public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Антонов", "8999123321");
        phoneBook.add("Антонов", "8912155326");
        phoneBook.add("Бобров", "8917155552");
        phoneBook.add("Бобров", "8913455672");
        phoneBook.add("Антонов", "899999999");
        phoneBook.add("Игнатов", "899111111");
        phoneBook.add("Бобров", "89923231999");
        phoneBook.add("Смирнов", "8888123113");
        phoneBook.add("Игнатов", "8324325234");

        System.out.println(phoneBook.get("Антонов"));
        System.out.println(phoneBook.get("Игнатов"));
        System.out.println(phoneBook.get("Бобров"));
        System.out.println(phoneBook.get("Смирнов"));
    }
}


