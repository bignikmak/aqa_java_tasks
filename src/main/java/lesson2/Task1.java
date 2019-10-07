package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {
    private String name;
    private int age;
    public String ageGroup;

    public Task1(String name, int age, String ageGroup) {
        this.name = name;
        this.age = age;
        this.ageGroup = ageGroup;
    }

    private String getName() {
        return name;
    }

    private String SetName(String name) {
        if (name.matches(" ")) {
            System.out.println("Space can't be used");
        }
        String capitalname = name.substring(0, 1).toUpperCase() + name.substring(1);
        return this.name = capitalname;

        for (int name.length < 3, name.length() > 50) {
            System.out.println("Name can't be this long");
        }

    }

    private int getAge(int age) {
        return age;
    }

    private void setAge(int age) {
        if (age < 0) {
            System.out.println("Age should be more than 0");
        } else {
            this.age = age;
        }
        if (age > 100) {
            System.out.println("Age should be less than 100");
        } else {
            this.age = age;
        }
    }

    public String getAgeGroup(String ageGroup) {
        return ageGroup;
    }

    private String SetageGroup(String ageGroup) {
        if (age < 15) {
            return ageGroup = "child";
        }
        if (age > 15 age < 25) {
            return ageGroup = "student";
        }
        if (age > 26 && age < 65) {
            return ageGroup = "worker";
        }
        if (age > 66) {
            return ageGroup = "pensioner";
        }
    }

}
