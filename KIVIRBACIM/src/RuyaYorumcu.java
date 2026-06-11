import java.util.*;
class RuyaYorumcu implements IRuyaYorumcu {
    private final Map<String, String> kelimeAnalizi;
    private final String[] genelYorumlar;

    public RuyaYorumcu() {
        kelimeAnalizi = new HashMap<>();
        kelimeAnalizi.put("yılan", "🐍 Yılan, bastırılmış korkular, içsel dönüşüm ya da şifa arayışını simgeler. Aynı zamanda tehlikelere karşı içgüdüsel bir uyarı olabilir.");
        kelimeAnalizi.put("su", "💧 Su, duyguların, bilinçaltının ve ruhsal temizliğin sembolüdür. Dingin su huzuru, dalgalı su ise içsel karmaşayı gösterir.");
        kelimeAnalizi.put("uçmak", "🕊️ Uçmak, özgürleşme, sınırları aşma arzusu ve ruhsal yükselişi temsil eder. Kontrolsüz uçuş korkuları da açığa çıkarabilir.");
        kelimeAnalizi.put("diş", "🦷 Diş rüyaları, kayıp, güçsüzlük ve değişim korkusunu yansıtır. Genellikle yaşamda bir kontrol kaybı hissinin ifadesidir.");
        kelimeAnalizi.put("balık", "🐟 Bilinçaltının derinliklerinden gelen sezgiler ve duygusal zenginlik anlamına gelir. Ayrıca yeni fırsatlar habercisidir.");
        kelimeAnalizi.put("ağaç", "🌳 Ağaç, yaşam enerjisi, köklenmek, aile bağları ve kişisel gelişimin sembolüdür.");
        kelimeAnalizi.put("deprem", "🌎 Deprem, yaşamında köklü değişimlere, içsel sarsıntılara ve güven duygusunun tehdit altında olduğuna işaret eder.");
        kelimeAnalizi.put("uçak düşmesi", "✈️ Uçak düşmesi, yüksek hedeflere ulaşamama korkusu veya kontrol kaybı kaygısını temsil eder.");
        kelimeAnalizi.put("başarısız", "📚 başarısız olmak, yetersizlik korkusu, özgüven eksikliği ve toplumsal baskılarla ilgili kaygıları temsil eder.");
        kelimeAnalizi.put("düşmek", "🪂 Düşmek, kontrol kaybı, başarısızlık korkusu ve destek eksikliği hissini simgeler.");
        kelimeAnalizi.put("kaçmak", "🏃‍♀️ Kaçmak, yüzleşilmek istenmeyen sorunlardan veya bastırılmış duygulardan kaçış arzusunu temsil eder.");
        kelimeAnalizi.put("kapana kısılmak", "🕳️ Kapana kısılmak, hayatında sıkışmışlık hissi, çaresizlik ve çıkış arayışını simgeler.");
        kelimeAnalizi.put("gölge", "Bilinçdışında bastırılmış karanlık yönlerin sembolüdür. Rüyalarda yüzeye çıkarak ego ile bütünleşmeye çalışır.");
        kelimeAnalizi.put("sel", "🌊 Sel, duyguların kontrolsüzce taşması ve bilinçaltındaki bastırılmış hislerin açığa çıkması anlamına gelir.");
        kelimeAnalizi.put("yangın", "🔥 Yangın, yoğun duygular, içsel öfke veya büyük değişim süreçlerini temsil eder.");
        kelimeAnalizi.put("ölmek", "⚰️ Ölmek, bir dönemin kapanışı, içsel değişim ve yeniden doğuş sürecini simgeler.");
        kelimeAnalizi.put("eski", "🏚️geçmiş yaşantıların özlemi veya eski benliğin yansımasıdır.");
        kelimeAnalizi.put("asansör", "🛗 Asansör görmek, duygusal iniş çıkışları, kontrol kaygısını ve kader üzerindeki etkisizlik duygusunu temsil eder.");
        kelimeAnalizi.put("karanlık", "🌑bilinmeyenle yüzleşme korkusu ve belirsizlik içinde kaybolmuşluk hissi olabilir.");
        kelimeAnalizi.put("aslan", "🦁 Aslan, içsel güç, liderlik ve cesaretin sembolüdür.");
        kelimeAnalizi.put("orman", "🌲 Orman görmek, bilinçaltının keşfedilmemiş yönleri ve içsel arayışı temsil eder.");
        kelimeAnalizi.put("kapı", "🚪 Kapı, yeni fırsatlar ve değişime açılan yolları temsil eder.");
        kelimeAnalizi.put("anahtar", "🔑 Anahtar, çözüm bulma, yeni fırsatlar yaratma ve kontrol sağlama arzusunu simgeler.");
        kelimeAnalizi.put("yüksek", "🪂büyük bir cesaret ve hayatındaki değişimlere gönüllü adım atma isteğini temsil eder.");
        kelimeAnalizi.put("kafes", "🦜 Kafes, bastırılmışlık, özgürlük isteği ve hayatında kısıtlamalar hissetme duygusunu simgeler.");
        kelimeAnalizi.put("ayna", "🪞 Ayna, kendini tanıma, içsel yüzleşme ve kimlik arayışını temsil eder.");
        kelimeAnalizi.put("tanımadığın biriyle konuşmak", "🗣️ Tanımadığın biriyle konuşmak, içsel keşif ve bilinmeyen yönlerin açığa çıkması anlamına gelir.");
        kelimeAnalizi.put("tren", "🚂 Tren görmek, hayatın belirli bir düzende akması veya başkalarının beklentilerine göre yaşama hissini simgeler.");
        kelimeAnalizi.put("gözyaşı", "😭 Gözyaşı, duygusal boşalma, acıların arınması ve ruhsal rahatlama arzusunu temsil eder.");
        kelimeAnalizi.put("boşluk", "🚪potansiyel fırsatlar veya içsel boşluk hissiyle ilişkilidir.");
        kelimeAnalizi.put("gözlük", "👓 Gözlük, gerçekleri daha net görme isteğini ve algı gelişimini temsil eder.");
        kelimeAnalizi.put("telefonda konuşmak", "📞 Telefonda konuşmak, iletişim ihtiyacı ve uzaktaki bir bağla temas arzusunu simgeler.");
        kelimeAnalizi.put("merdiven çıkmak", "🧗‍♀️ Merdiven çıkmak, kişisel gelişim, hedeflere ulaşma ve ruhsal yükselişi simgeler.");
        kelimeAnalizi.put("eski arkadaş", "👥 Eski arkadaş, geçmişle hesaplaşmayı veyahut derinde bir özlemi ifade edebilir.");
        kelimeAnalizi.put("yakın arkadaş", "👫 Yakın arkadaş, güven ve sadakat duygusunun bilinçaltı yansımasıdır.");
        kelimeAnalizi.put("düğün", "💍 Düğün görmek, yeni bir başlangıcı simgeler.");
        kelimeAnalizi.put("köpek", "🐶 Köpek, sadakat ve korumayı simgeler.");
        kelimeAnalizi.put("kedi", "🐱 Kedi, özgürlük ve zarafeti temsil eder.");
        kelimeAnalizi.put("araba", "🚗 Araba görmek, hayat yolculuğunuzu ve kontrolü simgeler.");
        kelimeAnalizi.put("uçurum", "🌍 Uçurum görmek, hayatınızda kararsızlık ve tehlikeli bir dönemi simgeler.");
        kelimeAnalizi.put("güvercin", "🕊️ Güvercin, barış ve huzur arayışını temsil eder.");
        kelimeAnalizi.put("güneş", "🌞 Güneş, başarı arzusu, aydınlanma ve pozitif enerjiyi simgeler.");
        kelimeAnalizi.put("ay", "🌙 Ay, duygusal değişim ve gizemli bir yönü simgeler.");
        kelimeAnalizi.put("zombi", "🧟 Zombi görmek, kaybolmuş bir yönünüzü ya da hayatta ilerleyemediğiniz bir durumu simgeler.");
        kelimeAnalizi.put("savaş", "⚔️içsel bölünmeler, kimlik çatışmaları ve bastırılmış agresyonların dışavurumudur.");
        kelimeAnalizi.put("yıldız", "⭐ Yıldız, umut ve geleceğe dair iyimser bir bakışı temsil eder.");
        kelimeAnalizi.put("rüzgar", "🌬️ Rüzgar, hayatınızdaki değişim ve yenilik arzusunu simgeler.");
        kelimeAnalizi.put("kar", "❄️ Kar görmek, temizlenme ve arınma arzusunu simgeler.");
        kelimeAnalizi.put("baba", "👨 Baba görmek, güven arayışı ve koruma ihtiyacını temsil eder.");
        kelimeAnalizi.put("anne", "👩 Anne görmek, beslenme ve sevgi ihtiyacını simgeler.");
        kelimeAnalizi.put("bebek", "👶Bilinçaltında saf duyguları, masumiyeti ve yeni başlangıçları temsil eder.");
        kelimeAnalizi.put("yol", "🛤️ Yol, yaşamınızın yönünü ve kararlarınızı temsil eder.");
        kelimeAnalizi.put("gemi", "🚢 Gemi, bir yolculuğa çıkmak ya da hayatın akışına güvenmek anlamına gelir.");
        kelimeAnalizi.put("deniz", "🌊 Deniz, bilinçaltı ve duygusal derinliklerinizi simgeler.");
        kelimeAnalizi.put("çocuk", "👶 Çocuk görmek, saf duyguları, masumiyeti ve yeni başlangıçları temsil eder.");
        kelimeAnalizi.put("kayıp", "🔍 Kayıp bir şey görmek, bir kaybı telafi etme arayışını simgeler.");
        kelimeAnalizi.put("büyüme", "🌱 Büyümek, gelişim ve olgunlaşma süreçlerinin bir işaretidir.");
        kelimeAnalizi.put("para", "💰 Para görmek, maddi güvenlik ve başarıya yönelik arzuları simgeler.");
        kelimeAnalizi.put("korku", "😨 Korku, bilinçaltındaki korkular ve kaygıları simgeler.");
        kelimeAnalizi.put("hüzün", "😔 Hüzünlü rüya görmek, bir kayıp ya da duygusal yıkımı simgeler.");
        kelimeAnalizi.put("arkadaş", "👫 Arkadaş görmek, güven, sadakat ve sosyal ilişkilerin önemini simgeler.");
        kelimeAnalizi.put("aşk", "❤️ Aşk, duygusal bağları ve tutkuyu simgeler.");
        kelimeAnalizi.put("mutluluk", "😊 Mutluluk, yaşamdan alınan haz ve içsel dengeyi temsil eder.");
        kelimeAnalizi.put("ağla", "Duyguların bastırılmadan akmasına ihtiyaç duyduğunu, bir içsel yük taşıdığını veya bir ruhsal boşalma yaşamak istediğini gösterir.");
        kelimeAnalizi.put("konser", "🎶Eğlenme ihtiyacı ve bir aradalık hissine duyulan özlem dışavurumu olabilir.");
        kelimeAnalizi.put("meclis", "🏛️ Meclis görmek, karar verme süreçlerine olan ilgiyi, demokratik değerlerle olan ilişkiyi simgeler. Aynı zamanda içsel çatışmaların çözümünü arayan bilinçaltını yansıtabilir.");
        kelimeAnalizi.put("oy kullanmak", "🗳️kişinin kendi yaşamı üzerinde söz hakkı arayışını ve karar vermekle ilgili bastırılmış kaygılarını yansıtır.");
        kelimeAnalizi.put("okul", "Bu rüya, genellikle kişinin eğitim hayatı, öğrenme süreci ve sosyal ilişkileri ile ilgili derin psikolojik anlamlar taşır.");
        genelYorumlar = new String[]{
                "🌌 Rüyanız bilinçaltınızdaki karışık duyguların bir yansıması olabilir. Kaçtığınız duygu ve düşüncelerle barışmaya adım atmanız faydalı olabilir",
                "🌠 Hayatınızda yeni bir döneme giriyor olabilirsiniz. Düşünce ve hislerinize alan tanıyın.",
                "🧠 İç dünyanızda çözülmeyi bekleyen duygusal çatışmalar olabilir.",
                "⚖️ Bu rüya, denge arayışınızı temsil ediyor olabilir.",
                "💭 Gördüğünüz semboller, çözülmesi gereken temaları işaret ediyor olabilir.",
                "🔮 Hayatınızda önemli bir değişikliğe duyulan isteğin dışavurumu olabilir. Düşüncelerinize değer verin.",
                "🦋 Değişim ve dönüşüm zamanı, bu rüya bu isteğe işaret olabilir.",
                "🌸 Duygusal ve zihinsel bir arınma süreci yaşıyor olabilirsiniz. Olabildiğince kendinizi dinlemenizde fayda var.",
                "🔥 Bastırılmış duyguların yüzeye çıkmaya çalıştığını gösteriyor olabilir. Kendinize zaman tanıyın.",
                "🌱 Yeni başlangıçlar için uygun bir zamana işaret ediyor olabilir. İç sesinize kulak verin."
        };
    }
    @Override
    public String analyze(String ruyagirisi) {
        ruyagirisi= ruyagirisi.toLowerCase(Locale.forLanguageTag("tr-TR"));
        List<String> matched = new ArrayList<>();

        for (String keyword : kelimeAnalizi.keySet()) {
            if (ruyagirisi.contains(keyword)) {
                matched.add(kelimeAnalizi.get(keyword));
            }
        }

        if (matched.isEmpty()) {
            return genelYorumlar[new Random().nextInt(genelYorumlar.length)];
        }

        return String.join("\n\n", matched);
    }
}
