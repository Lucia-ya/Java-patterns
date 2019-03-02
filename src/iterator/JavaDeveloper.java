package iterator;

/**
 * Разработчик, реализация Collection с массивом строк - навыков и именем.
 * Имеет конструктор, который принимает имя и массив навыков, и геттеры и сеттеры к ним.
 * реализация метода getIterator - возвращает экземпляр класса SkillIterator
 */
public class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    /** Внутренний класс - реализация Iterator, которая взаиодействует с массивом скиллов.*/
    public class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() { //Возвращает true если есть еще элементы в массиве
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() { //возвращает следующий элемент в массиве
            return skills[index++];
        }
    }
}
