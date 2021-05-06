package com.firsset.vocabularyenru.data.repository

import android.util.Log
import com.firsset.vocabularyenru.data.models.Word


class WordRepository {
    private var words: MutableList<Word> = mutableListOf()

    init {
        words.add(Word(1199, "в огне", "ablaze", "rus"))
        words.add(Word(10086, "отдаленный", "abstracted", "rus"))
        words.add(Word(15756, "соучастник", "accessary", "rus"))
        words.add(Word(16371, "счет", "account", "rus"))
        words.add(Word(10024, "отблагодарить", "acknowledge", "rus"))
        words.add(Word(3400, "действующий", "acting", "rus"))
        words.add(Word(15182, "сложение", "addition", "rus"))
        words.add(Word(18368, "член жюри", "adjudicator", "rus"))
//        words.add(Word(12278, "предостережение", "admonition", "rus"))
//        words.add(Word(2338, "выигрыш", "advantage", "rus"))
//        words.add(Word(14424, "самолет", "aeroplane", "rus"))
//        words.add(Word(4715, "засадить лесом", "afforest", "rus"))
//        words.add(Word(15935, "срок службы", "age", "rus"))
//        words.add(Word(28, "аграрный", "agrarian", "rus"))
//        words.add(Word(934, "бортмеханик", "air mechanic", "rus"))
//        words.add(Word(10915, "пиво", "ale", "rus"))
//        words.add(Word(1467, "весь", "all", "rus"))
//        words.add(Word(12651, "приманка", "allurement", "rus"))
//        words.add(Word(15948, "ссориться", "altercate", "rus"))
//        words.add(Word(9618, "окружающий", "ambient", "rus"))
//        words.add(Word(135, "аммиачный", "ammoniac", "rus"))
//        words.add(Word(4356, "забавный", "amusing", "rus"))
//        words.add(Word(2162, "вспомогательный", "ancillary", "rus"))
//        words.add(Word(17406, "уничтожать", "annihilate", "rus"))
//        words.add(Word(15663, "соперничество", "antagonism", "rus"))
//        words.add(Word(9569, "озабоченный", "anxious", "rus"))
//        words.add(Word(11042, "платье", "apparel", "rus"))
//        words.add(Word(5723, "касаться", "apply", "rus"))
//        words.add(Word(12492, "приближаться", "approximate", "rus"))
//        words.add(Word(247, "археология", "archaeology", "rus"))
//        words.add(Word(14185, "род войск", "arm", "rus"))
//        words.add(Word(17561, "устраивать", "arrange", "rus"))
//        words.add(Word(5432, "искусственный интеллект", "artificial intelligence", "rus"))
//        words.add(Word(12753, "пристыженный", "ashamed", "rus"))
//        words.add(Word(12463, "претендент", "aspirant", "rus"))
//        words.add(Word(13938, "расценивать /для обложения /", "assess", "rus"))
//        words.add(Word(4387, "заверение", "assurance", "rus"))
//        words.add(Word(17758, "физкультура", "athletics", "rus"))
//        words.add(Word(1710, "внимание", "attention", "rus"))
//        words.add(Word(15212, "слуховой", "auditory", "rus"))
//        words.add(Word(12, "автобиографический", "autobiographic", "rus"))
//        words.add(Word(15923, "среднее число", "average", "rus"))
//        words.add(Word(10342, "страх", "awestruck", "rus"))
//        words.add(Word(13076, "просроченный", "back", "rus"))
//        words.add(Word(7026, "лысый", "bald", "rus"))
//        words.add(Word(3185, "группа людей", "band", "rus"))
//        words.add(Word(6466, "крещение", "baptism", "rus"))
//        words.add(Word(127, "амбар", "barn", "rus"))
//        words.add(Word(368, "баскетбол", "basket ball", "rus"))
//        words.add(Word(18644, "штык", "bayonet", "rus"))
//        words.add(Word(11153, "побеждать", "beat", "rus"))
//        words.add(Word(13271, "прямая линия", "bee line", "rus"))
//        words.add(Word(1462, "вести себя", "behave", "rus"))
//        words.add(Word(12102, "пояс", "belt", "rus"))
//        words.add(Word(18959, "ягода", "berry", "rus"))
//        words.add(Word(11782, "помолвка", "betrothal", "rus"))
//        words.add(Word(12049, "похоронные дроги", "bier", "rus"))
//        words.add(Word(672, "бинокль", "binocular", "rus"))
//        words.add(Word(2948, "горечь", "bitterness", "rus"))
//        words.add(Word(6515, "кровоточить", "bleed", "rus"))
//        words.add(Word(521, "белокурый", "blond", "rus"))
//        words.add(Word(926, "боров", "boar", "rus"))
//        words.add(Word(15273, "смелый", "bold", "rus"))
//        words.add(Word(1068, "букмекер", "bookmaker", "rus"))
//        words.add(Word(9127, "оба", "both", "rus"))
//        words.add(Word(6998, "лужайка для игры в шары", "bowling green", "rus"))
//        words.add(Word(5890, "клеймо", "brand", "rus"))
//        words.add(Word(11703, "поломка", "breakdown", "rus"))
//        words.add(Word(8296, "невеста", "bride", "rus"))
//        words.add(Word(4267, "живой", "brisk", "rus"))
//        words.add(Word(14315, "ручей", "brook", "rus"))
//        words.add(Word(9631, "олень", "buck", "rus"))
//        words.add(Word(4454, "задира", "bully", "rus"))
//        words.add(Word(6367, "кража со взломом", "burglary", "rus"))
//        words.add(Word(7744, "мясник", "butcher", "rus"))
//        words.add(Word(12775, "притча во языцех", "byword", "rus"))
//        words.add(Word(406, "бедствие", "calamity", "rus"))
//        words.add(Word(1367, "верблюд", "camel", "rus"))
//        words.add(Word(18188, "чайница", "canister", "rus"))
//        words.add(Word(5678, "капсула", "capsule", "rus"))
//        words.add(Word(4620, "занятие", "career", "rus"))
//        words.add(Word(5699, "карикатура", "cartoon", "rus"))
//        words.add(Word(6893, "литая сталь", "cast steel", "rus"))
//        words.add(Word(5743, "категория", "category", "rus"))
//        words.add(Word(8689, "непрерывный", "ceaseless", "rus"))
//        words.add(Word(18125, "центральный", "central", "rus"))
//        words.add(Word(17724, "фаэтон", "chaise", "rus"))
//        words.add(Word(9128, "обаяние", "charm", "rus"))
//        words.add(Word(18481, "шашки", "checkers", "rus"))
//        words.add(Word(17914, "херувим", "cherub", "rus"))
//        words.add(Word(3563, "дети", "children", "rus"))
//        words.add(Word(18008, "хор", "choir", "rus"))
//        words.add(Word(18434, "чурбан", "chump", "rus"))
//        words.add(Word(18163, "циркуляция", "circulation", "rus"))
//        words.add(Word(19015, "ясность", "clarity", "rus"))
//        words.add(Word(17384, "умный", "clever", "rus"))
//        words.add(Word(3505, "деревенщина", "clodhopper", "rus"))
//        words.add(Word(18334, "чинить", "cobble", "rus"))
//        words.add(Word(5002, "зубчатое колесо", "cog wheel", "rus"))
//        words.add(Word(13711, "разрушение", "collapse", "rus"))
//        words.add(Word(3084, "гребень", "comb", "rus"))
//        words.add(Word(7270, "мемориальный", "commemorative", "rus"))
//        words.add(Word(1896, "волнение", "commotion", "rus"))
//        words.add(Word(6104, "компас", "compass", "rus"))
//        words.add(Word(4683, "запутанный", "complicated", "rus"))
//        words.add(Word(6116, "компромисс", "compromise", "rus"))
//        words.add(Word(9598, "окончание", "conclusion", "rus"))
//        words.add(Word(15126, "сласти", "confection", "rus"))
//        words.add(Word(12736, "приспосабливаться", "conform", "rus"))
//        words.add(Word(6124, "конгресс", "congress", "rus"))
//        words.add(Word(4933, "знаток", "connoisseur", "rus"))
//        words.add(Word(11934, "последовательность", "consistency", "rus"))
//        words.add(Word(7899, "назначать", "constitute", "rus"))
//        words.add(Word(15468, "совершенный", "consummate", "rus"))
//        words.add(Word(15849, "спор", "contest", "rus"))
//        words.add(Word(13138, "противоречие", "contradiction", "rus"))
//        words.add(Word(6187, "контузия", "contusion", "rus"))
//        words.add(Word(12027, "потрясать", "convulse", "rus"))
//        words.add(Word(11638, "полисмен", "cop", "rus"))
//        words.add(Word(14799, "сердцевина", "core", "rus"))
//        words.add(Word(5478, "исправлять", "correct", "rus"))
//        words.add(Word(6310, "косметический", "cosmetic", "rus"))
//        words.add(Word(13470, "равновесие", "counterpoise", "rus"))
//        words.add(Word(17623, "ухаживание", "courtship", "rus"))
//        words.add(Word(14946, "скалистый", "craggy", "rus"))
//        words.add(Word(7134, "мания", "craze", "rus"))
//        words.add(Word(11628, "ползать", "creep", "rus"))
//        words.add(Word(13444, "раболепствовать", "cringe", "rus"))
//        words.add(Word(17490, "урожай", "crop", "rus"))
//        words.add(Word(16661, "толпа", "crowd", "rus"))
//        words.add(Word(3937, "дробилка", "crusher", "rus"))
//        words.add(Word(12602, "прижаться", "cuddle", "rus"))
//        words.add(Word(1597, "виночерпий", "cupbearer", "rus"))
//        words.add(Word(390, "беглый", "cursory", "rus"))
//        words.add(Word(11156, "побить рекорд", "cut the record", "rus"))
//        words.add(Word(6748, "легкое прикосновение", "dab", "rus"))
//        words.add(Word(10857, "перхоть", "dandruff", "rus"))
//        words.add(Word(3283, "дата", "date", "rus"))
//        words.add(Word(2832, "глухой", "deaf", "rus"))
//        words.add(Word(13556, "развращать", "debauch", "rus"))
//        words.add(Word(9240, "обманчивый", "deceptive", "rus"))
//        words.add(Word(17363, "уменьшение", "decrement", "rus"))
//        words.add(Word(11848, "пораженец", "defeatist", "rus"))
//        words.add(Word(10147, "отклонять", "deflect", "rus"))
//        words.add(Word(3450, "делегировать", "delegate", "rus"))
//        words.add(Word(16274, "сумашедший", "demented", "rus"))
//        words.add(Word(546, "берлога", "den", "rus"))
//        words.add(Word(10092, "отдел", "department", "rus"))
//        words.add(Word(14980, "склад", "depository", "rus"))
//        words.add(Word(15901, "спускаться", "descend", "rus"))
//        words.add(Word(4184, "желательный", "desirable", "rus"))
//        words.add(Word(10106, "отделять", "detach", "rus"))
//        words.add(Word(2104, "вредный", "detrimental", "rus"))
//        words.add(Word(11159, "поборник", "devotee", "rus"))
//        words.add(Word(3612, "диаметральный", "diametrical", "rus"))
//        words.add(Word(13666, "разница", "difference", "rus"))
//        words.add(Word(9131, "обветшание", "dilapidation", "rus"))
//        words.add(Word(1227, "вагон-ресторан", "dining car", "rus"))
//        words.add(Word(12123, "правление", "directorate", "rus"))
//        words.add(Word(8562, "неодобрение", "disapprobation", "rus"))
//        words.add(Word(9706, "оправдание", "discharge", "rus"))
//        words.add(Word(13668, "разногласие", "discord", "rus"))
//        words.add(Word(2454, "высвобождать", "disengage", "rus"))
//        words.add(Word(8420, "нежелание", "disinclination", "rus"))
//        words.add(Word(15819, "спешивать", "dismount", "rus"))
//        words.add(Word(13847, "рассеивание", "dispersion", "rus"))
//        words.add(Word(15059, "скрывать", "dissimulate", "rus"))
//        words.add(Word(19011, "ясно", "distinctly", "rus"))
//        words.add(Word(5640, "канава", "ditch", "rus"))
//        words.add(Word(3455, "делитель", "divisor", "rus"))
//        words.add(Word(2083, "врач", "doctor", "rus"))
//        words.add(Word(6600, "кукла", "doll", "rus"))
//        words.add(Word(12555, "привратник", "doorkeeper", "rus"))
//        words.add(Word(15620, "сомнение", "doubt", "rus"))
//        words.add(Word(3466, "деловая часть города", "downtown", "rus"))
//        words.add(Word(3908, "драма", "drama", "rus"))
//        words.add(Word(7830, "нагоняй", "dressing down", "rus"))
//        words.add(Word(12877, "прогонять", "drive away", "rus"))
//        words.add(Word(6055, "колотить", "drub", "rus"))
//        words.add(Word(14525, "свалка", "dump", "rus"))
//        words.add(Word(16276, "сумерки", "dusk", "rus"))
//        words.add(Word(3636, "динамика", "dynamies", "rus"))
//        words.add(Word(4868, "земляной", "earthen", "rus"))
//        words.add(Word(13612, "раздраженный", "edgy", "rus"))
//        words.add(Word(4219, "женоподобный", "effeminate", "rus"))
//        words.add(Word(18754, "эгоцентричный", "egocentric", "rus"))
//        words.add(Word(12904, "продлевать", "elongate", "rus"))
//        words.add(Word(15330, "смущать", "embarrass", "rus"))
//        words.add(Word(5476, "исправлять", "emend", "rus"))
//        words.add(Word(17261, "указ", "enactment", "rus"))
//        words.add(Word(18807, "экциклопедия", "encyclopedia", "rus"))
//        words.add(Word(4783, "зацеплять", "engage", "rus"))
//        words.add(Word(4479, "зажигать", "enkindle", "rus"))
//        words.add(Word(10230, "отравлять", "envenom", "rus"))
//        words.add(Word(13274, "прямой", "erect", "rus"))
//        words.add(Word(17324, "улетучиваться", "escape", "rus"))
//        words.add(Word(10365, "оценка", "estimate", "rus"))
//        words.add(Word(712, "благозвучие", "euphony", "rus"))
//        words.add(Word(1482, "вечер", "evening", "rus"))
//        words.add(Word(10377, "очевидность", "evidence", "rus"))
//        words.add(Word(5504, "исследовать", "examine", "rus"))
//        words.add(Word(5586, "казначейство", "exchequer", "rus"))
//        words.add(Word(10058, "отвратительный", "execrable", "rus"))
//        words.add(Word(5533, "истощимый", "exhaustible", "rus"))
//        words.add(Word(13926, "растяжимый", "expansible", "rus"))
//        words.add(Word(9763, "опыт", "experience", "rus"))
//        words.add(Word(3564, "детонатор", "exploder", "rus"))
//        words.add(Word(2430, "выразимый", "expressible", "rus"))
//        words.add(Word(1704, "внешний", "exterior", "rus"))
//        words.add(Word(10376, "очевидец", "eye witness", "rus"))
//        words.add(Word(6908, "лицевой", "facial", "rus"))
//        words.add(Word(18564, "шкала", "fahrenheit", "rus"))
//        words.add(Word(1386, "вероломный", "faithless", "rus"))
//        words.add(Word(4367, "заболеть", "fall under ill", "rus"))
//        words.add(Word(4926, "знаменитый", "famous", "rus"))
//        words.add(Word(8160, "натянутый", "far fetched", "rus"))
//        words.add(Word(10375, "очаровывать", "fascinate", "rus"))
//        words.add(Word(17612, "утомление", "fatigue", "rus"))
//        words.add(Word(15637, "сообщество", "fellow ship", "rus"))
//        words.add(Word(12529, "привлекательный", "fetching", "rus"))
//        words.add(Word(15043, "скрипач", "fiddler", "rus"))
//        words.add(Word(4115, "ерзать", "figdet", "rus"))
//        words.add(Word(11831, "пополнять", "fill in", "rus"))
//        words.add(Word(17779, "финансовый", "financial", "rus"))
//        words.add(Word(6129, "конец", "finis", "rus"))
//        words.add(Word(2885, "годный", "fit", "rus"))
//        words.add(Word(18238, "человек", "fixture", "rus"))
//        words.add(Word(17790, "фламинго", "flamingo", "rus"))
//        words.add(Word(17797, "флиртовать", "flirt", "rus"))
//        words.add(Word(13514, "разбавление", "flooding", "rus"))
//        words.add(Word(8429, "нежность", "fondness", "rus"))
//        words.add(Word(15138, "след", "footprint", "rus"))
//        words.add(Word(6939, "лоб", "forehead", "rus"))
//        words.add(Word(12353, "предусмотрительность", "forethought", "rus"))
//        words.add(Word(17842, "форте", "forte", "rus"))
//        words.add(Word(5400, "ископаемое", "fossil", "rus"))
//        words.add(Word(2240, "вчетверо", "fourfold", "rus"))
//        words.add(Word(5674, "каприз", "freak", "rus"))
//        words.add(Word(3532, "дерзкий", "fresh", "rus"))
//        words.add(Word(17860, "фрегат", "frigate", "rus"))
//        words.add(Word(4578, "замерзший", "frozen", "rus"))
//        words.add(Word(11682, "полный", "full", "rus"))
//        words.add(Word(5646, "канатный", "funicular", "rus"))
//        words.add(Word(9978, "остроконечный", "gabled", "rus"))
//        words.add(Word(18634, "шторм", "gale", "rus"))
//        words.add(Word(6812, "лесник", "gamekeeper", "rus"))
//        words.add(Word(14393, "садовотство", "gardening", "rus"))
//        words.add(Word(11573, "поколение", "generation", "rus"))
//        words.add(Word(2684, "геодезия", "geodesy", "rus"))
//        words.add(Word(16340, "схватить", "get hold of", "rus"))
//        words.add(Word(12526, "привидение", "ghost", "rus"))
//        words.add(Word(5250, "имбирь", "ginger", "rus"))
//        words.add(Word(6765, "ледяной", "glacial", "rus"))
//        words.add(Word(817, "бойкий", "glib", "rus"))
//        words.add(Word(13396, "пылать", "glow", "rus"))
//        words.add(Word(13177, "проходить мимо", "go by", "rus"))
//        words.add(Word(6458, "крестница", "goddaughter", "rus"))
//        words.add(Word(443, "бездельник", "good for nothing", "rus"))
//        words.add(Word(8688, "непререкаемая истина", "gospeltruth", "rus"))
//        words.add(Word(3061, "грандиозный", "grandiose", "rus"))
//        words.add(Word(1327, "великий", "great", "rus"))
//        words.add(Word(3109, "грипп", "grippe", "rus"))
//        words.add(Word(5187, "изнурительный", "grueling", "rus"))
//        words.add(Word(18023, "хохот", "guffaw", "rus"))
//        words.add(Word(1599, "винтовка", "gun", "rus"))
//        words.add(Word(2746, "гинекология", "gynaecology", "rus"))
//        words.add(Word(14623, "сводный брат", "half brother", "rus"))
//        words.add(Word(2634, "гамак", "hammock", "rus"))
//        words.add(Word(14284, "руки прочь", "hands off", "rus"))
//        words.add(Word(8872, "несчасный", "hapless", "rus"))
//        words.add(Word(9112, "нуждаться", "hard up", "rus"))
//        words.add(Word(17461, "упряжь", "harness", "rus"))
//        words.add(Word(16716, "топорик", "hatchet", "rus"))
//        words.add(Word(2572, "выяснить", "have out", "rus"))
//        words.add(Word(9789, "орех", "hazel nut", "rus"))
//        words.add(Word(4841, "здоровье", "health", "rus"))
//        words.add(Word(18221, "чахоточный", "hectic", "rus"))
//        words.add(Word(14300, "руль", "helm", "rus"))
//        words.add(Word(14374, "с этих пор", "henceforward", "rus"))
//        words.add(Word(15939, "срубать", "hewdown", "rus"))
//        words.add(Word(2473, "высоко", "high", "rus"))
//        words.add(Word(4064, "его", "him", "rus"))
//        words.add(Word(18544, "шипеть", "hiss", "rus"))
//        words.add(Word(4634, "запас", "hoard", "rus"))
//        words.add(Word(7865, "надменный", "hoity toity", "rus"))
//        words.add(Word(1651, "владение акциями", "holding", "rus"))
//        words.add(Word(17494, "усадьба", "home stead", "rus"))
//        words.add(Word(6235, "копыто", "hoof", "rus"))
//        words.add(Word(2078, "враждебный", "hostile", "rus"))
//        words.add(Word(6718, "лачуга", "hovel", "rus"))
//        words.add(Word(8924, "неуклюжий", "hulking", "rus"))
//        words.add(Word(2935, "горбатый", "humpbacked", "rus"))
//        words.add(Word(2749, "гипнотизировать", "hypnotize", "rus"))
//        words.add(Word(5042, "идея", "idea", "rus"))
//        words.add(Word(5098, "известный", "illustrios", "rus"))
//        words.add(Word(18378, "чрезвычайно", "immensely", "rus"))
//        words.add(Word(8592, "неосязаемость", "impalpability", "rus"))
//        words.add(Word(17388, "умолять", "implore", "rus"))
//        words.add(Word(9692, "оплодотворять", "impregnate", "rus"))
//        words.add(Word(9922, "оспаривать", "impugn", "rus"))
//        words.add(Word(8598, "неотчуждаемый", "inalienable", "rus"))
//        words.add(Word(8845, "неспособность", "incapacity", "rus"))
//        words.add(Word(10000, "острый", "incisive", "rus"))
//        words.add(Word(8849, "неспособный", "incompetent", "rus"))
//        words.add(Word(570, "бесплотный", "incorporeal", "rus"))
//        words.add(Word(8772, "нерешительность", "indecision", "rus"))
//        words.add(Word(5306, "индекс", "index", "rus"))
//        words.add(Word(8389, "недомогание", "indisposition", "rus"))
//        words.add(Word(8608, "неоценимый", "inestimable", "rus"))
//        words.add(Word(10887, "пехота", "infantry", "rus"))
//        words.add(Word(8526, "немощь", "infirmity", "rus"))
//        words.add(Word(8065, "нарушение", "infraction", "rus"))
//        words.add(Word(12289, "предписание", "injunction", "rus"))
//        words.add(Word(8304, "невиновность", "innocence", "rus"))
//        words.add(Word(8012, "напор", "inrush", "rus"))
//        words.add(Word(1730, "внутренняя сторона", "inside", "rus"))
//        words.add(Word(6178, "контролер", "inspector", "rus"))
//        words.add(Word(12031, "поучительный", "instructive", "rus"))
//        words.add(Word(8893, "нетронутый", "intact", "rus"))
//        words.add(Word(7968, "намерение", "intention", "rus"))
//        words.add(Word(1680, "вмешательство", "interference", "rus"))
//        words.add(Word(1282, "вводить", "introduce", "rus"))
//        words.add(Word(14271, "ругать", "inveigh", "rus"))
//        words.add(Word(12568, "приглашение", "invitation", "rus"))
//        words.add(Word(14674, "сглаживать", "iron out", "rus"))
//        words.add(Word(8775, "нерешительный", "irresolute", "rus"))
//        words.add(Word(5536, "исход", "issue", "rus"))
//        words.add(Word(18443, "шакал", "jackal", "rus"))
//        words.add(Word(11109, "плохой строитель", "jerry builder", "rus"))
//        words.add(Word(8107, "насмешка", "jibe", "rus"))
//        words.add(Word(15536, "соединение", "join", "rus"))
//        words.add(Word(1432, "веселый радостный", "joyous", "rus"))
//        words.add(Word(8764, "нервозный", "jumpy", "rus"))
//        words.add(Word(9433, "объяснять", "justify", "rus"))
//        words.add(Word(3525, "держаться в стороне", "keep off", "rus"))
//        words.add(Word(17151, "удар ногой", "kick", "rus"))
//        words.add(Word(5592, "как будто", "kind of", "rus"))
//        words.add(Word(9483, "огород", "kitchen garden", "rus"))
//        words.add(Word(308, "база знаний", "knowledge base", "rus"))
//        words.add(Word(13458, "рабочий", "labourer", "rus"))
//        words.add(Word(6681, "лагуна", "lagoon", "rus"))
//        words.add(Word(4854, "землевладелец", "landowner", "rus"))
//        words.add(Word(18694, "щедрость", "largesse", "rus"))
//        words.add(Word(6713, "латинский", "latin", "rus"))
//        words.add(Word(17070, "уборная", "lavatory", "rus"))
//        words.add(Word(11473, "подчеркивать", "lay stress", "rus"))
//        words.add(Word(1790, "вождь", "leader", "rus"))
//        words.add(Word(4251, "жесткий", "leathery", "rus"))
//        words.add(Word(2463, "выслушать", "lend an ear", "rus"))
//        words.add(Word(11521, "позволять", "let", "rus"))
//        words.add(Word(14345, "рычаг", "lever", "rus"))
//        words.add(Word(6925, "лишайник лишай", "lichen", "rus"))
//        words.add(Word(1196, "в натуральную величину", "life sized", "rus"))
//        words.add(Word(1392, "вероятность", "likelihood", "rus"))
//        words.add(Word(6866, "линейный", "linear", "rus"))
//        words.add(Word(19026, "ящерица", "lizard", "rus"))
//        words.add(Word(12104, "поясница", "loin", "rus"))
//        words.add(Word(4430, "заглянуть к", "look in", "rus"))
//        words.add(Word(11563, "покинутый", "lorn", "rus"))
//        words.add(Word(8431, "любящий", "loving", "rus"))
//        words.add(Word(14563, "светило", "luminary", "rus"))
//        words.add(Word(14239, "роскошь", "luxury", "rus"))
//        words.add(Word(900, "больший", "major", "rus"))
//        words.add(Word(7443, "млекопитающее", "mammal", "rus"))
//        words.add(Word(7129, "маневр", "manoeuvre", "rus"))
//        words.add(Word(16294, "супружеский", "marital", "rus"))
//        words.add(Word(5628, "каменщик", "mason", "rus"))
//        words.add(Word(7182, "материальный", "material", "rus"))
//        words.add(Word(7481, "могу", "may", "rus"))
//        words.add(Word(7176, "масштаб", "measure", "rus"))
//        words.add(Word(7216, "мегафон", "megaphone", "rus"))
//        words.add(Word(15198, "слуга", "menial", "rus"))
//        words.add(Word(10883, "петля", "mesh", "rus"))
//        words.add(Word(16070, "столица", "metropolis", "rus"))
//        words.add(Word(7399, "мина", "mien", "rus"))
//        words.add(Word(7409, "министр", "minister", "rus"))
//        words.add(Word(8396, "недоразумение", "misapprehension", "rus"))
//        words.add(Word(1276, "ввести в заблуждение", "mislead", "rus"))
//        words.add(Word(15500, "современный", "modern", "rus"))
//        words.add(Word(7554, "монетный", "monetary", "rus"))
//        words.add(Word(18420, "чудовищный", "monstrous", "rus"))
//        words.add(Word(901, "больший", "more", "rus"))
//        words.add(Word(899, "большая часть", "most", "rus"))
//        words.add(Word(7562, "монтировать", "mount", "rus"))
//        words.add(Word(9196, "обильный", "much", "rus"))
//        words.add(Word(14514, "сбор", "muster", "rus"))
//        words.add(Word(7909, "наивность", "naivete", "rus"))
//        words.add(Word(18770, "экономика страны", "nation economy", "rus"))
//        words.add(Word(16786, "тошнотворный", "nauseous", "rus"))
//        words.add(Word(2845, "гнездо", "nest", "rus"))
//        words.add(Word(3738, "довольно новый", "newish", "rus"))
//        words.add(Word(9005, "никель", "nickel", "rus"))
//        words.add(Word(378, "башка", "noddle", "rus"))
//        words.add(Word(14719, "северный", "northern", "rus"))
//        words.add(Word(16550, "теперь", "now", "rus"))
//        words.add(Word(9450, "обязательство", "obligation", "rus"))
//        words.add(Word(7776, "наблюдатель", "observer", "rus"))
//        words.add(Word(4306, "житель", "occupant", "rus"))
//        words.add(Word(13030, "пропаганда", "official", "rus"))
//        words.add(Word(5353, "интерактивный", "on line", "rus"))
//        words.add(Word(8188, "начало", "opening", "rus"))
//        words.add(Word(9749, "оптимум", "optimum", "rus"))
//        words.add(Word(14715, "себя", "ourselves", "rus"))
//        words.add(Word(18783, "экскурсия", "outing", "rus"))
//        words.add(Word(13650, "размер больше стандартного", "outsize", "rus"))
//        words.add(Word(16581, "терять равновесие", "overbalance", "rus"))
//        words.add(Word(9290, "обозревать", "overlook", "rus"))
//        words.add(Word(18441, "шаг", "pace", "rus"))
//        words.add(Word(6393, "краска", "paint", "rus"))
//        words.add(Word(10525, "паркет", "parquet", "rus"))
//        words.add(Word(10105, "отделять", "partition off", "rus"))
//        words.add(Word(5023, "игра", "pastime", "rus"))
//        words.add(Word(14195, "родовой", "patrimonial", "rus"))
//        words.add(Word(17116, "увольнять", "pay off", "rus"))
//        words.add(Word(5972, "кое-как", "pell mell", "rus"))
//        words.add(Word(11724, "полуостров", "peninsula", "rus"))
//        words.add(Word(13186, "процент", "per cent", "rus"))
//        words.add(Word(12204, "предательский", "perfidious", "rus"))
//        words.add(Word(17438, "упорство", "perseverance", "rus"))
//        words.add(Word(11472, "подходящий", "pertinent", "rus"))
//        words.add(Word(529, "бензин", "petrol", "rus"))
//        words.add(Word(16524, "телосложение", "physique", "rus"))
//        words.add(Word(12090, "поштучно", "piecemeal", "rus"))
//        words.add(Word(16064, "столб", "pillar", "rus"))
//        words.add(Word(12978, "прокалывать", "pink", "rus"))
//        words.add(Word(16592, "тех  шатун", "pistonrod", "rus"))
//        words.add(Word(18429, "чума", "plague", "rus"))
//        words.add(Word(17204, "удовольствие", "pleasure", "rus"))
//        words.add(Word(11116, "плуг", "plough", "rus"))
//        words.add(Word(11123, "плюс", "plus", "rus"))
//        words.add(Word(7986, "наотрез", "pointblank", "rus"))
//        words.add(Word(11635, "полировка", "polish", "rus"))
//        words.add(Word(11808, "понтон", "pontoon", "rus"))
//        words.add(Word(3627, "дикобраз", "porcupine", "rus"))
//        words.add(Word(11697, "положение", "position", "rus"))
//        words.add(Word(12020, "потомство", "posterity", "rus"))
//        words.add(Word(16659, "толочь", "pound", "rus"))
//        words.add(Word(12037, "похвальный", "praise worthy", "rus"))
//        words.add(Word(12112, "правило", "precept", "rus"))
//        words.add(Word(12322, "предрешать", "predetermine", "rus"))
//        words.add(Word(18130, "цепкий", "prehensile", "rus"))
//        words.add(Word(10661, "перевес", "preponderance", "rus"))
//        words.add(Word(6143, "консервированный", "preseved", "rus"))
//        words.add(Word(12467, "претензия", "pretension", "rus"))
//        words.add(Word(17288, "укол", "prick", "rus"))
//        words.add(Word(5177, "изначальный", "primordial", "rus"))
//        words.add(Word(12527, "привилелегия", "privilege", "rus"))
//        words.add(Word(13534, "разведчик", "procpector", "rus"))
//        words.add(Word(13151, "профессионал", "professional", "rus"))
//        words.add(Word(3307, "движение вперед", "progression", "rus"))
//        words.add(Word(10854, "перспективный", "promising", "rus"))
//        words.add(Word(6299, "корректура", "proof reader", "rus"))
//        words.add(Word(13657, "размножать", "propogate", "rus"))
//        words.add(Word(1563, "вид", "prospect", "rus"))
//        words.add(Word(2500, "выступ", "protrudion", "rus"))
//        words.add(Word(17516, "условие", "proviso", "rus"))
//        words.add(Word(13298, "псевдоним", "pseudonym", "rus"))
//        words.add(Word(13315, "пуддинг", "pudding", "rus"))
//        words.add(Word(15383, "снимать", "pull off", "rus"))
//        words.add(Word(5606, "каламбур", "pun", "rus"))
//        words.add(Word(15511, "согласно", "pursuant", "rus"))
//        words.add(Word(11702, "положить", "put", "rus"))
//        words.add(Word(4565, "замазка", "putty", "rus"))
//        words.add(Word(5760, "качественно", "qualitively", "rus"))
//        words.add(Word(16110, "странный", "queer", "rus"))
//        words.add(Word(15841, "спокойно", "quietly", "rus"))
//        words.add(Word(14272, "ругать", "rail", "rus"))
//        words.add(Word(13541, "разветвление", "ramification", "rus"))
//        words.add(Word(9072, "норма", "rate", "rus"))
//        words.add(Word(16397, "сырой", "raw", "rus"))
//        words.add(Word(10714, "переделывать", "readjust", "rus"))
//        words.add(Word(11202, "повстанец", "rebel", "rus"))
//        words.add(Word(17144, "удаление", "recession", "rus"))
//        words.add(Word(6105, "компенсация", "recompence", "rus"))
//        words.add(Word(6773, "лежащий", "recumbent", "rus"))
//        words.add(Word(16885, "тростник", "reed", "rus"))
//        words.add(Word(12391, "преломлять", "refract", "rus"))
//        words.add(Word(11651, "полк", "regiment", "rus"))
//        words.add(Word(10683, "перевоплощение", "reincarnation", "rus"))
//        words.add(Word(10289, "отсылать", "relegate", "rus"))
//        words.add(Word(1995, "воспоминание", "rememberance", "rus"))
//        words.add(Word(1862, "возобновление", "renewal", "rus"))
//        words.add(Word(10090, "отдача", "repercussion", "rus"))
//        words.add(Word(2002, "воспроизводить", "reproduce", "rus"))
//        words.add(Word(16349, "сходство", "resembalance", "rus"))
//        words.add(Word(14131, "решение", "resolution", "rus"))
//        words.add(Word(14113, "ресторан", "restaurant", "rus"))
//        words.add(Word(1380, "вернуть", "retrive", "rus"))
//        words.add(Word(9291, "обозревать", "review", "rus"))
//        words.add(Word(14166, "рифма", "rhyme", "rus"))
//        words.add(Word(16612, "тир", "rifle range", "rus"))
//        words.add(Word(6965, "локон", "ringlet", "rus"))
//        words.add(Word(11091, "плотва", "roach", "rus"))
//        words.add(Word(11121, "плутни", "roguery", "rus"))
//        words.add(Word(10885, "петух", "rooster", "rus"))
//        words.add(Word(14268, "рубль", "rouble", "rus"))
//        words.add(Word(6281, "королевский", "royal", "rus"))
//        words.add(Word(2711, "гибель", "ruin", "rus"))
//        words.add(Word(14755, "сельский", "rural", "rus"))
//        words.add(Word(10866, "песок", "sand", "rus"))
//        words.add(Word(14488, "сатир", "satyr", "rus"))
//        words.add(Word(11228, "поговорка", "saying", "rus"))
//        words.add(Word(11020, "планировать", "schedule", "rus"))
//        words.add(Word(745, "блестеть", "scintillate", "rus"))
//        words.add(Word(18778, "экран", "screen", "rus"))
//        words.add(Word(13869, "рассматривать", "scrutinize", "rus"))
//        words.add(Word(15589, "сокрытие", "secretion", "rus"))
//        words.add(Word(10971, "питомник", "seed plot", "rus"))
//        words.add(Word(10025, "отборочный", "selective", "rus"))
//        words.add(Word(11729, "полутон", "semitone", "rus"))
//        words.add(Word(3615, "диван", "settee", "rus"))
//        words.add(Word(6719, "лачуга", "shack", "rus"))
//        words.add(Word(13104, "простыня", "sheet", "rus"))
//        words.add(Word(11231, "погон", "shoulder strap", "rus"))
//        words.add(Word(6658, "кустарник", "shrub", "rus"))
//        words.add(Word(14855, "сигнальщик", "signalman", "rus"))
//        words.add(Word(5413, "искренний", "sincere", "rus"))
//        words.add(Word(15070, "скудно снабжать", "skimp", "rus"))
//        words.add(Word(4136, "жаворонок", "sky lark", "rus"))
//        words.add(Word(8785, "неряха", "slattern", "rus"))
//        words.add(Word(14462, "сани", "sleigh", "rus"))
//        words.add(Word(10992, "плавить", "smelt", "rus"))
//        words.add(Word(6731, "легкая закуска", "snack", "rus"))
//        words.add(Word(18035, "храп", "snore", "rus"))
//        words.add(Word(2822, "глупый", "soft headed", "rus"))
//        words.add(Word(15594, "солидарность", "solidarity", "rus"))
//        words.add(Word(7008, "лунатик", "somnambulist", "rus"))
//        words.add(Word(7512, "мокрый", "soppy", "rus"))
//        words.add(Word(18926, "южный", "southerly", "rus"))
//        words.add(Word(1029, "брус", "spar", "rus"))
//        words.add(Word(9919, "особый", "specific", "rus"))
//        words.add(Word(10591, "пачкать", "splotch", "rus"))
//        words.add(Word(9078, "носик", "spout", "rus"))
//        words.add(Word(16834, "трезвый", "staid", "rus"))
//        words.add(Word(16095, "стоящий", "standing", "rus"))
//        words.add(Word(8627, "неподвижный", "static", "rus"))
//        words.add(Word(16170, "строгий", "stern", "rus"))
//        words.add(Word(16035, "стимулировать", "stimulate", "rus"))
//        words.add(Word(5303, "инвентаризация", "stocktaking", "rus"))
//        words.add(Word(4771, "затычка", "stopper", "rus"))
//        words.add(Word(17252, "узкий", "strait", "rus"))
//        words.add(Word(11712, "полоска", "strip", "rus"))
//        words.add(Word(16199, "студент", "student", "rus"))
//        words.add(Word(4488, "заика", "stutterer", "rus"))
//        words.add(Word(1340, "величественный", "sublime", "rus"))
//        words.add(Word(16331, "существование", "subsistence", "rus"))
//        words.add(Word(16099, "страдать", "suffer", "rus"))
//        words.add(Word(13061, "проситель", "suitor", "rus"))
//        words.add(Word(12186, "превосходство", "supremacy", "rus"))
//        words.add(Word(2614, "газон", "sward", "rus"))
//        words.add(Word(16438, "тактика", "tactics", "rus"))
//        words.add(Word(13578, "разговор", "talk", "rus"))
//        words.add(Word(13481, "равносильный", "tantamount", "rus"))
//        words.add(Word(5438, "искушение", "temptation", "rus"))
//        words.add(Word(17222, "ужас", "terror", "rus"))
//        words.add(Word(10299, "оттепель", "thaw", "rus"))
//        words.add(Word(12094, "поэтому", "therefore", "rus"))
//        words.add(Word(1505, "вещь", "thing", "rus"))
//        words.add(Word(2954, "горло", "throat", "rus"))
//        words.add(Word(16429, "так", "thus", "rus"))
//        words.add(Word(4855, "земледелец", "tiller", "rus"))
//        words.add(Word(13412, "пьянствовать", "tipple", "rus"))
//        words.add(Word(11218, "поганка", "toadstool", "rus"))
//        words.add(Word(12086, "пошлина", "toll", "rus"))
//        words.add(Word(1530, "вздор", "tosh", "rus"))
//        words.add(Word(2967, "горожанин", "townee", "rus"))
//        words.add(Word(14356, "ряд", "train", "rus"))
//        words.add(Word(10697, "передавать", "transmit", "rus"))
//        words.add(Word(10534, "пародия", "travesty", "rus"))
//        words.add(Word(14174, "ров", "trench", "rus"))
//        words.add(Word(8075, "нарядный", "trig", "rus"))
//        words.add(Word(10430, "падать", "tumble", "rus"))
//        words.add(Word(17037, "убавлять", "turn down", "rus"))
//        words.add(Word(8847, "неспособный", "unable", "rus"))
//        words.add(Word(8375, "недоверие", "unbelief", "rus"))
//        words.add(Word(16053, "стойкий", "uncompromising", "rus"))
//        words.add(Word(8741, "неравноценный", "unequal", "rus"))
//        words.add(Word(8542, "необоснованный", "ungrounded", "rus"))
//        words.add(Word(8467, "неизвестное", "unknown", "rus"))
//        words.add(Word(13780, "распаковывать", "unpack", "rus"))
//        words.add(Word(1895, "волнение", "unrest", "rus"))
//        words.add(Word(8321, "невообразимый", "unthinkble", "rus"))
//        words.add(Word(11986, "построение", "upbuilding", "rus"))
//        words.add(Word(14243, "рост", "upsurge", "rus"))
//        words.add(Word(14248, "ростовщический", "usurious", "rus"))
//        words.add(Word(13341, "пустой", "vacuous", "rus"))
//        words.add(Word(1250, "вампир", "vampire", "rus"))
//        words.add(Word(14616, "свод", "vault", "rus"))
//        words.add(Word(18973, "язвительный", "venomous", "rus"))
//        words.add(Word(9767, "опытный", "versed", "rus"))
//        words.add(Word(11359, "подлый", "vile", "rus"))
//        words.add(Word(7659, "мужество", "virility", "rus"))
//        words.add(Word(6630, "купорос", "vitriol", "rus"))
//        words.add(Word(2876, "говорливость", "volubility", "rus"))
//        words.add(Word(2222, "вулканизировать", "vulcanize", "rus"))
//        words.add(Word(12961, "произвольный", "wanton", "rus"))
//        words.add(Word(2358, "вылинявший", "washed out", "rus"))
//        words.add(Word(1774, "водянистый", "watery", "rus"))
//        words.add(Word(13179, "проходить", "wear off", "rus"))
//        words.add(Word(11009, "плакать", "weep", "rus"))
//        words.add(Word(4630, "западный", "western", "rus"))
//        words.add(Word(17483, "ураган", "whirlwind", "rus"))
//        words.add(Word(4839, "здоровый", "wholesome", "rus"))
//        words.add(Word(15513, "согласный", "willing", "rus"))
//        words.add(Word(7367, "мигать", "wink", "rus"))
//        words.add(Word(4466, "задумчивый", "wistful", "rus"))
//        words.add(Word(18469, "шаткий", "wobbly", "rus"))
//        words.add(Word(18511, "шерсть", "wool", "rus"))
//        words.add(Word(18118, "ценность", "worth", "rus"))
//        words.add(Word(2318, "выжимать", "wring", "rus"))
//        words.add(Word(13269, "пряжа", "yarn", "rus"))



    }

    public fun getWordList(vocType: String): List<Word> {
        return words.filter { it -> it.vocType == vocType }
    }

}