package com.firsset.vocabularyenru.data.repository

import android.util.Log
import com.firsset.vocabularyenru.data.models.Word


class WordRepository {
    private var words: MutableList<Word> = mutableListOf()

    init {
        words.add(Word(152,"Flutter","is a set of Google user interface tools for building beautiful, source-compiled mobile, web, and desktop applications from a single code Flutter is a set of Google user interface tools for building beautiful, source-compiled mobile, web, and desktop applications from a single code base.","eng"))
        words.add(Word(154,"Флютер","Комплект средств разработки и фреймворк с открытым исходным кодом для создания мобильных приложений под Android и iOS, а также веб-приложений с использованием языка программирования Dart, разработанный и развиваемый корпорацией Google","rus"))
        words.add(Word(156,"Java","A strongly typed, general-purpose object-oriented programming language developed by Sun Microsystems","eng"))
        words.add(Word(158,"Java","Строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems","rus"))
        words.add(Word(160,"Компиляция","Трансляция программы, составленной на исходном языке высокого уровня, в эквивалентную программу на низкоуровневом языке, близком машинному коду (абсолютный код, объектный модуль, иногда на язык ассемблера), выполняемая компилятором","rus"))
        words.add(Word(162,"Freelancer","are terms commonly used for a person who is self-employed and not necessarily committed to a particular employer long-term. Freelance workers are sometimes represented by a company or a temporary agency that resells freelance labor to clients; others work independently or use professional associations or websites to get work.","eng"))
        words.add(Word(164,"Фрилансер","или внештатный работник , термин обычно используемый для человека, работающего по найму и не обязательно стремится к конкретному работодателю в долгосрочной перспективе. Внештатные работники иногда представлены компанией или временным агентством, которое перепродает внештатную рабочую силу клиентам; другие работают независимо или используют профессиональные ассоциации или веб-сайты для поиска работы.","rus"))
        words.add(Word(166,"Compilation","Translation of a program written in a high-level source language into an equivalent program in a low-level language close to machine code (absolute code, object module, sometimes into assembly language), performed by the compiler","eng"))
        words.add(Word(168,"Linux","семейство Unix-подобных операционных систем на базе ядра Linux, включающих тот или иной набор утилит и программ проекта GNU, и, возможно, другие компоненты. Как и ядро Linux, системы на его основе, как правило, создаются и распространяются в соответствии с моделью разработки свободного и открытого программного обеспечения","rus"))
        words.add(Word(170,"Linux","a family of Unix-like operating systems based on the Linux kernel, including one or another set of utilities and programs of the GNU project, and possibly other components. Like the Linux kernel, systems based on it are usually created and distributed according to the free and open source software development model.","eng"))
        words.add(Word(172,"Active Directory","Microsoft directory services for the Windows Server family of operating systems. Originally designed as an LDAP-compliant directory service implementation, starting with Windows Server 2008 includes the ability to integrate with other authorization services, serving as an integrating and unifying role for them.","eng"))
        words.add(Word(174,"Активный каталог"," службы каталогов корпорации Microsoft для операционных систем семейства Windows Server. Первоначально создавалась, как LDAP-совместимая реализация службы каталогов, однако, начиная с Windows Server 2008, включает возможности интеграции с другими службами авторизации, выполняя для них интегрирующую и объединяющую роль. ","rus"))
        words.add(Word(176,"UX","дословно означает «опыт пользователя». В более широком смысле это понятие про весь опыт, который получает пользователь при взаимодействии с сайтом или приложением.","rus"))
        words.add(Word(178,"UX","literally means user experience. In a broader sense, this is the concept of all the experience that a user gets when interacting with a site or application.","eng"))
        words.add(Word(180,"UI","And not necessarily just graphic: tactile, voice or sound. We will only look at the graphical interface, as designers mainly work with it.","eng"))
        words.add(Word(182,"UI","переводится как «пользовательский интерфейс». И необязательно только графический: тактильный, голосовой или звуковой. Мы рассмотрим только графический интерфейс, так как дизайнеры в основном работают с ним.","rus"))
        words.add(Word(184,"Инсталляция ","Процесс установки программного обеспечения на компьютер конечного пользователя. Выполняется особой программой, присутствующей в операционной системе, или же входящим в состав самого программного обеспечения средством установки. ","rus"))
        words.add(Word(186,"Инсталляция ","The process of installing software on an end user's computer. It is performed by a special program present in the operating system, or by an installer that is part of the software itself.","eng"))
        words.add(Word(188,"Project management"," деятельность по достижению поставленных целей и задач проекта. Ключевым фактором успеха проектного управления является наличие чёткого заранее определённого плана, минимизации рисков и отклонений от плана, эффективного управления изменениями","rus"))
        words.add(Word(190,"Project management","activities to achieve the goals and objectives of the project. The key factor for the success of project management is the presence of a clear predetermined plan, minimization of risks and deviations from the plan, effective change management","eng"))
        words.add(Word(192,"JSON","текстовый формат обмена данными, основанный на JavaScript. Как и многие другие текстовые форматы, JSON легко читается людьми. Формат JSON был разработан Дугласом Крокфордом.","rus"))
        words.add(Word(194,"JSON","a textual data interchange format based on JavaScript. Like many other text formats, JSON is easy for humans to read. The JSON format was developed by Douglas Crockford.","eng"))


    }

    public fun getWordList(): List<Word> {
//        return words.filter { it -> it.vocType == vocType }
        return words
    }

}