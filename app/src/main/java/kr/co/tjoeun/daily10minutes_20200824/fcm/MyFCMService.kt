package kr.co.tjoeun.daily10minutes_20200824.fcm

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


//17:MyFCMService -> 18:프로젝트상세페이지(activity_view_project_detail.xml)
class MyFCMService: FirebaseMessagingService(){

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        Log.d("새로발급된기기토큰", p0)
    }

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
        Log.d("받은메세지.제목", p0.notification?.title.toString())
        Log.d("받은메세지.내용", p0.notification?.body.toString())

        //17-1:메인 쓰레드 - UI쓰레드를 돌아주는 myHandler를 통해 토스트 출력
        val myHandler = Handler(Looper.getMainLooper())
        myHandler.post {
            Toast.makeText(applicationContext, p0.notification?.title.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}