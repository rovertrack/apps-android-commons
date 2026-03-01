package fr.free.nrw.commons.nearby;

import java.util.Arrays;
import java.util.List;

/**
 * Centralized place Q-ID lists of class/sublcass  used to filter {@link Label}. To add a new
 * Wikidata - class/sublcass to a label, simply append its Q-ID here.
 */
public final class PlaceClassQIds {

    public static final List<String> BUILDING = Arrays.asList(
        "Q41176",                          // building
        "Q61443690",                       // branch post office
        "Q11755880",                       // residential building
        "Q751876",                         // chÃ¢teau
        "Q212198",                         // pub
        "Q61443650",                       // sub post office
        "Q1303167",                        // barn
        "Q1577547",                        // revenue house
        "Q62447",                          // aerodrome
        "Q16560",                          // palace
        "Q13360578",                       // thatched cottage
        "Q44613",                          // monastery
        "Q35054",                          // post office
        "Q24354",                          // theatre building
        "Q607241",                         // clergy house
        "Q12496021",                       // Madrasah Tsanawiyah
        "Q55678",                          // railway stop
        "Q61278455",                       // health sub-centre
        "Q879050",                         // manor house
        "Q1362233",                        // Upper Lusatian house
        "Q25550691",                       // city hall
        "Q30114662",                       // accommodation facility for dependent elderly people
        "Q12496019"                        // madrasah aliyah

    );
    public static final List<String> BANK = Arrays.asList(
        "Q22687",                           // bank
        "Q66619497",                        // HDFC Bank branch
        "Q13601825",                        // Sparkasse
        "Q157963",                          // savings bank
        "Q848507",                          // commercial bank
        "Q66344",                           // central bank
        "Q2111088",                         // private bank
        "Q568041",                          // universal bank
        "Q1553482",                         // specialized bank
        "Q1641457",                         // mortgage bank
        "Q116763799",                       // federal credit union
        "Q116763871",                       // federally insured, state-chartered credit union
        "Q2917176",                         // savings bank
        "Q60767305",                        // neobank
        "Q7309198",                         // regional bank
        "Q319845",                          // investment bank
        "Q118719824",                       // caja rural
        "Q131441953",                       // Romanian bank
        "Q5266746",                         // development bank
        "Q1227557",                         // direct bank
        "Q665634",                          // cantonal bank
        "Q124014095",                       // state-chartered bank
        "Q486547",                          // Shinkin bank
        "Q76218249",                        // retail bank
        "Q105758271",                       // multilateral development bank
        "Q6972269",                         // national development bank
        "Q1802186",                         // state development institution
        "Q5154919",                         // community bank
        "Q57775246",                        // agricultural bank
        "Q4481787",                         // Federal Reserve Bank
        "Q14948396",                        // Regional Rural Bank
        "Q65954115",                        // State Bank of India branch
        "Q65954144",                        // Canara bank branch
        "Q251927"                           // public bank

    );
    public static final List<String> HOSPITAL = Arrays.asList(
        "Q16917",                           // hospital
        "Q64578911",                        // former hospital
        "Q7257872",                         // public hospital
        "Q210999",                          // psychiatric hospital
        "Q4284971",                         // private hospital
        "Q1059324",                         // university hospital
        "Q2387974",                         // military hospital
        "Q2440002",                         // general hospital
        "Q2945655",                         // centre hospitalier
        "Q61451856",                        // rural hospital
        "Q644264",                          // children's hospital
        "Q1813474",                         // teaching hospital
        "Q958822"                           // maternity hospital

    );
    public static final List<String> HOUSE = Arrays.asList(
        "Q3947",                            // house
        "Q585956",                          // masia
        "Q489357",                          // farmhouse
        "Q5783996",                         // cottage
        "Q3950",                            // villa
        "Q13360578",                        // thatched cottage
        "Q607241",                          // clergy house
        "Q1362233",                         // Upper Lusatian house
        "Q875016",                          // terrace house
        "Q1307276",                         // single-family detached home
        "Q5773747",                         // historic house
        "Q12020836",                        // timber-framed house
        "Q918230",                          // Roman villa
        "Q1078374",                         // tenement
        "Q1169748",                         // cascina a corte
        "Q1365179",                         // private mansion
        "Q1802963",                         // mansion
        "Q109838242",                       // thatched farmhouse
        "Q2087181",                         // historic house museum
        "Q1343246",                         // English country house
        "Q1408475",                         // fortified house
        "Q16884952",                        // country house
        "Q1202402",                         // townhouse
        "Q279118",                          // wooden house
        "Q17051104",                        // manse
        "Q2588110"                          // aisled house
    );
    public static final List<String> COTTAGE = Arrays.asList(
        "Q5783996",                          // cottage
        "Q13360578",                         // thatched cottage
        "Q108618134",                        // workers cottage
        "Q108618186",                        // farm labourers cottage
        "Q108618194"                         // estate cottage
    );
    public static final List<String> FARMHOUSE = Arrays.asList(
        "Q489357",                           // farmhouse
        "Q109838242",                        // thatched farmhouse
        "Q252021",                           // villa rustica
        "Q2735929",                          // baserri
        "Q25339974",                         // quinta
        "Q5670577",                          // alqueria
        "Q107357065",                        // Staphorster boerderij
        "Q1655611",                          // plantation house
        "Q132213",                           // Haubarg
        "Q1258093",                          // three-sided farm
        "Q16054427",                         // Appenzell farmhouse
        "Q494311",                           // Low German house
        "Q280209",                           // mas
        "Q2196898",                          // Frisian farmhouse
        "Q2178278",                          // langgevelboerderij
        "Q18810296",                         // keuterij
        "Q18810430",                         // Frisian farmhouse
        "Q8196150",                          // almunia
        "Q2364632",                          // T-boerderijen
        "Q452393",                           // Vierkanthof
        "Q2295256",                          // castle farm
        "Q108445444",                        // Simmental farmhouse
        "Q3068953",                          // fortified farm
        "Q17463976"                          // long house farm

    );
    public static final List<String> CHURCH = Arrays.asList(
        "Q16970",                            // church
        "Q108325",                           // chapel
        "Q317557",                           // parish church
        "Q14552192",                         // chapel-shrine
        "Q1088552",                          // Catholic Church building
        "Q2031836",                          // Eastern Orthodox church building
        "Q1129743",                          // filial church
        "Q56242063",                         // Protestant church building
        "Q1424583",                          // sepulchral chapel
        "Q56750657",                         // hermitage church
        "Q55876909",                         // Catholic parish church
        "Q56242215",                         // Catholic cathedral
        "Q1975485",                          // Orthodox chapel
        "Q2977",                             // cathedral
        "Q1457501",                          // cemetery chapel
        "Q744296",                           // wooden church
        "Q120560",                           // minor basilica
        "Q19899465",                         // former church
        "Q17485079",                         // church ruin
        "Q1509716",                          // collegiate church
        "Q334383",                           // abbey church
        "Q10631691"                          // Catholic pilgrimage church

    );
    public static final List<String> RAILWAY_STATION = Arrays.asList(
        "Q55488",                            // railway station
        "Q928830",                           // metro station
        "Q4663385",                          // former railway station
        "Q4312270",                          // railway station above ground
        "Q11670533",                         // elevated station
        "Q85882206",                         // unmanned station
        "Q4346602",                          // passenger railway station
        "Q1147171",                          // interchange station
        "Q11606300",                         // last station
        "Q55493",                            // goods station
        "Q55491",                            // underground railway station
        "Q332496",                           // overtaking station
        "Q55485",                            // dead-end railway station
        "Q121844689",                        // contracted station
        "Q1793804",                          // S-Bahn station
        "Q2142091",                          // over-track railway station
        "Q27996466"                          // Bahnhof (station)
    );
    public static final List<String> GATEHOUSE = Arrays.asList(
        "Q277760",                          // Gatehouse
        "Q130487075"                        // industrial gatehouse
    );
    public static final List<String> MILESTONE = Arrays.asList(
        "Q10145",                           // milestone
        "Q896635",                          // Saxon post milestone
        "Q84163056",                        // Royal Saxon milestone
        "Q13360570",                        // milliarium
        "Q846760",                          // Ichirizuka
        "Q329477",                          // kilometre zero
        "Q99675033",                        // Liberty Road milestone
        "Q31837185",                        // Berliner Meilensteine
        "Q1470024"                          // myriameterstone

    );
    public static final List<String> INN = Arrays.asList(
        "Q256020",                           // inn
        "Q5526694",                          // Gasthaus
        "Q367914",                           // bed and breakfast
        "Q1209783"                           // shukuba
    );
    public static final List<String> HOTEL = Arrays.asList(
        "Q27686",                             // hotel
        "Q654772",                            // hostel
        "Q256020",                            // inn
        "Q5526694",                           // Gasthaus
        "Q2460422",                           // guest house
        "Q182676",                            // mountain hut
        "Q186347",                            // caravanserai
        "Q617839",                            // apartment hotel
        "Q339969",                            // Alpine club hut
        "Q87487749",                          // former hotel
        "Q1065252",                           // pension
        "Q2880255",                           // resort hotel
        "Q111137435",                         // villa hotel
        "Q1589077",                           // youth hostel
        "Q64995589",                          // country house hotel
        "Q216212",                            // motel
        "Q56439882",                          // lodge
        "Q115040846",                         // hotel brand
        "Q367914",                            // bed and breakfast
        "Q562930",                            // ryokan
        "Q1209783"                            // shukuba
    );
    public static final List<String> CITY = Arrays.asList(
        "Q515",                               // city
        "Q1093829",                           // city in the United States
        "Q15661340",                          // ancient city
        "Q1549591",                           // big city
        "Q42744322",                          // urban municipality in Germany
        "Q902814",                            // border city
        "Q148837",                            // polis
        "Q132680629",                         // city in North Carolina
        "Q3147563",                           // capital of regency
        "Q12131624",                          // city in Ukraine
        "Q13218690",                          // town in Hungary
        "Q2202509",                           // Roman city
        "Q748149",                            // prefecture-level city
        "Q2264924",                           // port city
        "Q15105893",                          // town in Croatia
        "Q63440326",                          // city of Oregon
        "Q2616791",                           // urban municipality of Poland
        "Q5770918",                           // city of Argentina
        "Q707813",                            // Hanseatic city
        "Q89691",                             // ksar
        "Q16858213",                          // town in Romania
        "Q7819319",                           // Czech municipality with expanded powers
        "Q25412763"                           // city in Chile

    );
    public static final List<String> UNIVERSITY = Arrays.asList(
        "Q3918",                              // university
        "Q189004",                            // college
        "Q902104",                            // private university
        "Q875538",                            // public university
        "Q845392",                            // polytechnic
        "Q7603893",                           // state public university
        "Q131389368",                         // state private university
        "Q1743327",                           // church college
        "Q1365560",                           // university of applied sciences
        "Q1371037",                           // institute of technology
        "Q576603",                            // Bible college
        "Q62078547",                          // public research university
        "Q15936437",                          // research university
        "Q557206",                            // Catholic university
        "Q3551775",                           // university in France
        "Q265662",                            // national university
        "Q615150"                             // land-grant university
    );
    public static final List<String> SCHOOL = Arrays.asList(
        "Q3914",                              // school
        "Q9842",                              // primary school
        "Q1080794",                           // public school
        "Q19855165",                          // rural school
        "Q97042318",                          // sekolah dasar
        "Q11902693",                          // coeducational school
        "Q423208",                            // private school
        "Q97500812",                          // Sekolah Menengah Pertama
        "Q9826",                              // high school
        "Q67015940",                          // Government Boys' Primary School
        "Q159334",                            // secondary school
        "Q5358913",                           // elementary school in Japan
        "Q136386339",                         // temporarily closed school
        "Q322563",                            // vocational school
        "Q67388747",                          // urban school
        "Q97598588",                          // Sekolah Menengah Atas
        "Q12496021",                          // Madrasah Tsanawiyah
        "Q55521176",                          // lower secondary school in Japan
        "Q12496019",                          // madrasah aliyah
        "Q149566",                            // middle school
        "Q64063386",                          // upper primary school
        "Q4671329",                           // academy school
        "Q64063317",                          // lower primary school
        "Q123945716",                         // public primary school in Morocco
        "Q64062731",                          // higher secondary school
        "Q57775518",                          // lower secondary school
        "Q88965416",                          // school unit
        "Q5155053",                           // community school
        "Q20950067",                          // elementary school
        "Q56351315",                          // Japanese high school
        "Q96386155",                          // national school
        "Q67015944",                          // Government Girls Primary School
        "Q134739441",                         // rural settlement school
        "Q1110689",                           // special education school
        "Q11146499",                          // aided school
        "Q134739026",                         // Indigenous school
        "Q12496022",                          // madrasah ibtidaiyah
        "Q22713629",                          // girls' school
        "Q11486291",                          // permanently closed school
        "Q7940971",                           // voluntary aided school
        "Q70206617",                          // national primary school
        "Q3803834",                           // istituto tecnico
        "Q2418495",                           // independent school
        "Q133804953",                         // quilombola school
        "Q55043",                             // gymnasium
        "Q269770",                            // boarding school
        "Q7940973",                           // voluntary controlled school
        "Q162633",                            // academy
        "Q12708689",                          // national secondary school
        "Q111236457",                         // Catalonian school
        "Q10509147",                          // comprehensive school
        "Q65032826",                          // folkeskole
        "Q1713379",                           // boys' school
        "Q1800213",                           // primary school in Norway
        "Q1021290",                           // music school
        "Q69106538",                          // Chinese national type school
        "Q11396122",                          // school annex
        "Q1542966",                           // gymnasium
        "Q43271061",                          // special needs school in Japan
        "Q3831968",                           // liceo scientifico
        "Q67015947"                           // Govt: (B) H/Sec: School Hingorno
    );
    public static final List<String> EDUCATION = Arrays.asList(
        "Q8434",                              // education
        "Q11900959",                          // online course
        "Q64801076",                          // education in country or region
        "Q541394"                             // mixed-sex education
    );
    public static final List<String> ISLE = Arrays.asList(
        "Q23442",                             // island
        "Q207524",                            // islet
        "Q162602",                            // river island
        "Q216851"                             // skerry
    );
    public static final List<String> MOUNTAIN = Arrays.asList(
        "Q8502",                              // mountain
        "Q8072",                              // volcano
        "Q503269",                            // seamount
        "Q169358",                            // stratovolcano
        "Q429088",                            // mons
        "Q5421955",                           // fell
        "Q1197120",                           // extinct volcano
        "Q1368970",                           // volcanic cone
        "Q623319",                            // mesa
        "Q212057"                             // shield volcano
    );
    public static final List<String> AIRPORT = Arrays.asList(
        "Q1248784",                           // airport
        "Q644371",                            // international airport
        "Q837800",                            // domestic airport
        "Q106643740",                         // federal aeroport
        "Q21836433",                          // commercial airport
        "Q55612991",                          // greenfield airport
        "Q20992031",                          // abandoned airport
        "Q104905692",                         // airport straddling borders
        "Q28692646"                           // artificial island airport
    );
    public static final List<String> BRIDGE = Arrays.asList(
        "Q12280",                             // bridge
        "Q537127",                            // road bridge
        "Q1210334",                           // railway bridge
        "Q1068842",                           // footbridge
        "Q158438",                            // arch bridge
        "Q1825472",                           // covered bridge
        "Q39486269",                          // railway viaduct
        "Q158218",                            // truss bridge
        "Q3397526",                           // stone bridge
        "Q181348",                            // viaduct
        "Q12570",                             // suspension bridge
        "Q12042110",                          // steel bridge
        "Q7197275",                           // pipeline bridge
        "Q43514341",                          // highway bridge
        "Q1055465",                           // girder bridge
        "Q158555"                             // cable-stayed bridge
    );
    public static final List<String> ROAD = Arrays.asList(
        "Q34442",                             // road
        "Q79007",                             // street
        "Q207934",                            // avenue
        "Q12763914",                          // third-class road
        "Q7543083",                           // avenue
        "Q12731",                             // dead end street
        "Q19796778",                          // route dÃ©partementale
        "Q1251403",                           // alley
        "Q54114",                             // boulevard
        "Q46622",                             // controlled-access highway
        "Q89021600",                          // B road
        "Q18019452",                          // A road
        "Q1426271",                           // route nationale
        "Q269949",                            // highway
        "Q1525",                              // roundabout
        "Q1788582",                           // state highway
        "Q194029"                             // Roman road
    );
    public static final List<String> FOREST = Arrays.asList(
        "Q4421",                               // forest
        "Q7315273",                            // forest reserve
        "Q2324919",                            // state forest
        "Q612741",                             // United States National Forest
        "Q64148071",                           // classified forest
        "Q15900779",                           // Bannwald
        "Q6629955",                            // forest park
        "Q1197552",                            // urban forest
        "Q208478",                             // old-growth forest
        "Q3079027"                             // national forest
    );
    public static final List<String> PARK = Arrays.asList(
        "Q22698",                              // park
        "Q22746",                              // urban park
        "Q167346",                             // botanical garden
        "Q46169",                              // national park
        "Q43501",                              // zoo
        "Q22652",                              // urban green space
        "Q194195",                             // amusement park
        "Q2006279",                            // provincial park of Canada
        "Q18618819",                           // national park of Australia
        "Q6063204",                            // regional park
        "Q272231",                             // arboretum
        "Q3363945"                             // archaeological park
    );
    public static final List<String> RIVER = Arrays.asList(
        "Q4022",                               // river
        "Q187971",                             // wadi
        "Q16465938",                           // seasonal river
        "Q591942",                             // distributary
        "Q373315",                             // arroyo
        "Q4792460",                            // arm
        "Q573344",                             // main stem
        "Q4366834",                            // transboundary river
        "Q27067659",                           // former river
        "Q108822533"                           // border river
    );
    public static final List<String> WATERFALL = Arrays.asList(
        "Q34038",                               // waterfall
        "Q12053053",                            // artificial waterfall
        "Q2967706"                              // coastal waterfall
    );
    public static final List<String> TEMPLE = Arrays.asList(
        "Q44539",                              // temple
        "Q5393308",                            // Buddhist temple
        "Q842402",                             // Hindu temple
        "Q2680845"                             // Chinese temple

    );
}
