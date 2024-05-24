package com.oguzavanoglu.composeapplication.ui

import androidx.lifecycle.ViewModel

class FactsViewModel : ViewModel() {

    fun generateRandomFact(selectedAnimal : String) : String{

        return if (selectedAnimal == "Dog"){
            getDogFacts().random()
        }
        else{
            getCatsFacts().random()
        }


    }

    fun getDogFacts() : List<String> {

        val dogFacts = listOf(

            "Köpekler, küçük bir çocuğun zekasına sahiplerdir.",
            "Eğitilmeye yatkın canlılar olan köpekler, insanlar gibi öğrenebilme yetisine sahiptirler.",
            "Cinslere göre değişmek üzere bir köpek 150- 200 civarında kelime öğrenebilir." ,
            "Sahiplerinin el hareketlerini hafızalarına kazırlar.",
            "Köpeklerin de zaman algısı vardır." ,
            "Renkleri flu algılarlar ama karanlıkta insanlardan daha iyi görürler." ,
            "Köpeklerin gözlerini korumak için üçüncü bir göz kapakları daha vardır." ,
            "Köpeklerin koku alma yetileri insanlarınkinden bin kat daha iyidir. İnsanların koku alma hücreleri ancak 5 milyon iken köpeklerinki 2 milyon 200 bin kadardır." ,
            "Köpeklerin burun izleri insanların parmak izleri gibi biricik ve kendilerine hastır." ,
            "Köpeklerin burunlarının ıslak olması kokuları daha iyi alabilmelerini sağlar." ,
            "İnsanların 32 dişi varken köpeklerin diş sayısı 42’dir." ,
            "Köpeklerin dillerinde tat almayı sağlayan yaklaşık 17000 reseptör bulunur. Bu sayı insanlarda ancak 9000’dir." ,
            "İnsanların bir kulağında 6 kas bulunurken köpeklerde bu sayı 18’dir." + "İnsanların duyduğu mesafenin dört katı kadar uzaklıktaki sesleri de duyabilirler." ,
            "Vücut ısıları insanlardan daha yüksek derecededir." ,
            "Köpeklerin tüm vücutları tüylerle kaplı olsa da üşürler." ,
            "Tez bezlerine sahip olmadıkları için patilerinden terlerler." ,
            "Köpeklerin ilk gelişen duyuları dokunmadır.  Bu nedenle köpekler fiziksel temasa olumlu tepki verirler." ,
            "Köpekler de insanlar gibi sağ ya da sol patilerinden birini daha etkin olarak kullanarak solak ya da sağlak olabilirler." ,
            "İnsanların duygu durumunu yüzlerinden anlayan tek canlılardır." ,
            "Köpekler de insanlar gibi sevdiklerini özlerler." ,
            "Köpeklerde kıskanma duygusu mevcuttur." ,
            "insanların fiziksel rahatsızlıklarını anlayabilirler." ,
            "Köpekler de insanlar gibi depresyona girebilirler." ,
            "Doğduklarında kör, sağır ve dişsizdirler." ,
            "İçgüdüsel olarak iyi birer yüzücüdürler." ,
            "Doğada sürüler halinde yaşarlar." ,
            "Bir köpeğin sağlıklı olduğu dilinin pembeliğinden anlaşılır. Ama Chow Chow gibi bazı köpek ırklarının dilleri siyahtır." ,
            "Bazı köpek ırkları doğuştan belirli bir oranda sağırdırlar. Bu ırklardan biri Dalmaçyalı’dır." ,
            "Bazı tazı türleri çitalardan daha hızlı koşabilirler.",
            "Kısırlaştırma operasyonu geçirmiş köpekler diğerlerinden daha uzun yaşarlar." ,
            "Antik Mısır’da köpeklere çok saygı duyulur, köpeği ölen insanlar günlerce yas tutarlardı." ,
            "Dünyada en çok evcil köpek Amerika Birleşik Devletleri’ndedir. İkincilik ise Fransa’nındır." ,
            "Yapılan çalışmalara ve bulunan fosillere göre yaklaşık 33 bin yıldır yeryüzünde olan köpeklerin günümüzde dünya üzerindeki sayıları 400 milyon civarındadır."

        )
        return dogFacts
    }

    fun getCatsFacts() : List<String>{

        val catsFatcs = listOf(

            "Kediler yüksek tansiyon hastalarına iyi gelmekte ve kan basıncını azaltmaktadır.",
            "Kedilerin duyma yetileri köpeklerden ve insanlardan daha güçlüdür." ,
            "Kediler karanlıkta insanlardan 6 kat daha iyi görürler." ,
            "Her 3 Amerikalı'dan biri kedi besliyor." ,
            "Bir kedinin kürkünün bir santimetrekaresinde 12.000'in üzerinde tüy bulunur.",
            "Kediler elektrik prizleri ile kablolarla oynamaya bayılırlar. Ama bunlar kediler için çok tehlikeli olabilir. Bu yüzden evde kedilerin zarar görmemesi için elektrikli eşyalar kontrol altına alınmalıdır." ,
            "Kedilerin bıyıkları çevredeki hareketlere karşı son derece duyarlıdır. Ani bir hareket hemen bıyıklar tarafından algılanır." ,
            "Kediler, avlanma sahalarını ev sahaları olarak kabul ederler ve bir erkek kedinin ev sahası dişi kedininkinden yaklaşık 10 kat büyüktür." ,
            "Londra'da bir stadyumda 'görevli' bir kedinin 6 yıl içinde yaklaşık 12.500 adet fare avladığı rapor edilmiştir." + "Bir yavru kedinin sağlıklı bir yetişkin olabilmesi için en azından 3 ay boyunca annesi ile birlikte kalması gerekir." + "Erkek kediler 6-8 aylıkken, dişi kediler ise erkek kedilerden yaklaşık 2 ay önce erişkinliğe kavuşurlar." + "Kediler yüzebilirler ama iyi yüzücü değildirler. O yüzden deniz, nehir, yüzme havuzu gibi su bölgeleri kediler için düştükleri takdirde çok tehlikeli olabilir.",
            "Kediler kendilerine ait sahayı yoğunlaşmış sidik ile işaretleyerek diğer kedilerin o alana girmemesi için bir tür uyarıda bulurlar.",
            "Evde yaşayan kediler ev eşyalarının ve kendi eşyalarının (su, yemek kaplarının, tuvaletlerinin) yerlerinin değişmesinden hiç mi hiç hoşlanmazlar.",
            "Evcil hayvanlarınızın kedi mamasını ayakaltı bir yere koymayın. Yemek yerken mahremiyet isterler. Bu sebeple sıkça geçilen yerler yemek alanı olarak doğru değildir." ,
            "1949-1964 yılları arasında Britanya Pasaport Dairesi'nde çalışan Peter isimli kedi kadrolu personel arasındaydı ve yılda 6.5 sterling ücret alıyordu." ,
            "Ne yazık ki şehir hayatı kediler için çok tehlikeli olmakta.. Örneğin 750 bin kişinin yaşadığı Baltimore kentinde her yıl 5.000 kedi trafik kazalarının kurbanı oluyor.",
            "1950 yılında dağcıları izleyen İsviçreli bir kedi dağcılarla birlikte Alplerin zirvesine (4.478 metre) çıkmıştır.",
            "Kediler oyun oynamaya bayılırlar. Özellikle yavru kediler için oyun aynı zamanda sosyalleşme anlamındadır."
        )
        return catsFatcs
    }
}