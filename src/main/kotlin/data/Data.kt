package data

data class Person(var who: String, var whom: String, var description: String)

class Data {

    var listPerson = ArrayList<Person>()

    fun data(): ArrayList<Person> {

        listPerson.add(Person("ssrnav", "megachips", "настольные игры"))
        listPerson.add(Person("Lin", "lizza", "электронная музыка"))
        listPerson.add(Person("Тот-кого-нельзя-называть", "Парашютик", "Компьютерные игры, настольные игры, пазлы, предметы для создания уюта в доме, дозор."))
        listPerson.add(Person("Шанель №1","Lin", "Декор для дома,косметика"))
        listPerson.add(Person("megachips", "Тот-кого-нельзя-называть", "Блин, вообще очень хочу крутой фонарь для дозора, готов даже вернуть часть денег за него, например если найдется хороший фонарь с перезаряжаемым акумулятором до косаря <br>Или на крайняк вот такое полотенце(синее или голубое - хз) https://www.decathlon.ru/polotentse-iz-mikrofibry_e1-id_8361623.html"))
        listPerson.add(Person("Парашютик", "Шанель №1","-Толстовку без молнии с капюшоном чёрную или темно-темно-красную(бардо) без рисунков и надписей(L-XL)\uD83D\uDE0D<br>-Что-то интерьерное в скандинавском стиле чёрное/белое(вместе)"))
        listPerson.add(Person("lizza", "Kira", "Термокружка, книга в жанре фентези"))
        listPerson.add(Person("Kira", "MR.TS-s-s-s-s", "Зарядка для Mi Band 2. Ребята, вот прям позарез нужно, потерял свою и как без рук =(  Вот как он выглядет: https://avatars.mds.yandex.net/get-marketpic/174398/market_N8Bn2ksIDVO8vx0opcvlQA/orig"))
        listPerson.add(Person("MR.TS-s-s-s-s", "ssrnav", "Страйкбол, проганье, компы, телефоны, игры настольные и нет, приблуды в машину, ардуино"))
        return listPerson

    }


}