package com.hello.shayriapp.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hello.shayriapp.R
import com.hello.shayriapp.model.ShayriModel
import com.hello.shayriapp.ui.theme.primaryLight

@Composable
fun MainToolbar(title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.size(45.dp)
                .clickable {
                    onClick.invoke()
                }
            ,
            colors = CardDefaults.cardColors(
                containerColor = primaryLight
            ),
            shape = RoundedCornerShape(100.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }

        Text(
            text = title, style = TextStyle(
                fontSize = 24.sp, fontWeight = FontWeight.Bold
            ), color = Color.White, modifier = Modifier.padding(start = 25.dp)
        )
    }
}


fun getList(): List<ShayriModel>{
    val shayriData = listOf(
        ShayriModel(
            "Love", listOf(
                "तेरा नाम लूँ जुबां से, जी लूँ मैं ये अरमां",
                "तू जो मिली है दिल को, मुझे खुशियों का जहाँ मिला है",
                "इश्क़ की गहराई में, जब दिल डूब जाता है",
                "तुम्हारी हर बात से, मुझे इश्क़ हो जाता है",
                "तेरे बिना एक पल भी जीना गवारा नहीं",
                "तू है तो ज़िन्दगी रंगीन है",
                "पल पल दिल के पास, तुम रहते हो",
                "तेरे बिना अधूरी है, मेरी ज़िन्दगी की कहानी",
                "तेरी मुस्कान से रोशन है, मेरा हर दिन",
                "तेरे प्यार में मैंने खुद को खो दिया",
                "तेरे बिना कुछ भी अच्छा नहीं लगता",
                "तुम ही हो, तुम ही हो, ज़िन्दगी अब तुम ही हो",
                "तेरे बिना अधूरा हूँ मैं",
                "तेरा नाम मेरे होंठों पर है, मेरी रूह में बसा है",
                "तू ही मेरी मंज़िल है, तू ही मेरा सफर है"
            )
        ),
        ShayriModel(
            "Sad", listOf(
                "अब तो दिल भी नहीं धड़कता, तुम्हारे बिना",
                "आंसू भी अब तो साथ नहीं देते, तेरी याद में",
                "दिल तोड़ के जाने वाले, तुझे क्या मिला?",
                "तेरे बिना जिंदगी वीरान लगती है",
                "आँखों में नींद नहीं, दिल में सुकून नहीं",
                "तेरे बिना हर खुशी अधूरी है",
                "तेरे जाने के बाद, बस तन्हाई का आलम है",
                "मोहब्बत में हम हार गए, तुझे जीतने की चाह में",
                "तेरी यादों के सिवा, कुछ भी पास नहीं",
                "दिल के दर्द को बयां कैसे करूँ?",
                "तूने दिल तोड़ा है, रूह भी टूट गई है",
                "तेरे बिना जिंदगी में कुछ भी नहीं बचा",
                "तेरी बेवफाई ने मुझे तोड़ दिया",
                "तेरे बिना जीना अब मुश्किल है",
                "आंसू भी अब थक चुके हैं, बहने से"
            )
        ),
        ShayriModel(
            "Friendship", listOf(
                "दोस्ती का रिश्ता सबसे खास होता है",
                "तू है तो हर लम्हा हसीन है",
                "दोस्तों के बिना जिंदगी अधूरी है",
                "सच्ची दोस्ती कभी खत्म नहीं होती",
                "तेरी दोस्ती ने मुझे जिंदगी की राह दिखाई",
                "दोस्ती का मतलब है एक-दूसरे का साथ",
                "दोस्ती का रिश्ता अनमोल होता है",
                "तेरे बिना हर पार्टी अधूरी है",
                "दोस्तों के साथ हर पल मस्ती है",
                "दोस्ती के बिना जीवन सूना है",
                "दोस्ती में कोई शर्त नहीं होती",
                "तेरी दोस्ती ने मुझे हंसना सिखाया",
                "दोस्तों का साथ हमेशा चाहिए",
                "दोस्ती का मतलब है खुशियों का खजाना",
                "दोस्ती का रिश्ता सबसे प्यारा होता है"
            )
        ),
        ShayriModel(
            "Motivational", listOf(
                "हार मत मानो, मंज़िल मिलेगी",
                "कठिनाइयों से लड़कर ही जीत हासिल होती है",
                "सपने देखो और उन्हें पूरा करो",
                "मेहनत ही सफलता की चाबी है",
                "अपने लक्ष्य पर ध्यान दो",
                "समय की कद्र करो, सफलता मिलेगी",
                "खुद पर विश्वास रखो, हर मुश्किल पार करोगे",
                "हौसला बनाए रखो, सफलता तुम्हारी होगी",
                "असफलता से घबराओ मत, सीख लो",
                "प्रयास करते रहो, हार मानना नहीं",
                "संघर्ष ही जीवन है",
                "हिम्मत और मेहनत से सब कुछ संभव है",
                "सपनों को सच करो, मेहनत से",
                "आशा का दामन मत छोड़ो",
                "हर दिन एक नई शुरुआत है"
            )
        ),
        ShayriModel(
            "Life", listOf(
                "जिंदगी एक सफर है, हसीन है",
                "हर पल को जीयो, खुश रहो",
                "जिंदगी में उतार-चढ़ाव आते रहते हैं",
                "जीवन का हर पल अनमोल है",
                "हर दिन नई उम्मीदें लाता है",
                "जीवन का अर्थ खुश रहना है",
                "सपने देखो और उन्हें जीयो",
                "जीवन में प्यार सबसे महत्वपूर्ण है",
                "हर दिन एक नई शुरुआत है",
                "जीवन का सफर खुद तय करो",
                "जिंदगी में कभी हार मत मानो",
                "जीवन एक खूबसूरत तोहफा है",
                "हर पल को जी भर के जीयो",
                "जीवन में सच्चे रिश्ते सबसे कीमती होते हैं",
                "जिंदगी में खुश रहना सबसे बड़ा धर्म है"
            )
        )
    )
    return shayriData
}