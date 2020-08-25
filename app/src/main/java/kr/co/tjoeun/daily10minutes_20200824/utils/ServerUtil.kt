package kr.co.tjoeun.daily10minutes_20200824.utils

import android.util.Log
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

//3:OkHttp(Manifest+build.gradle) -> 4:postRequestLogin함수만들기
class ServerUtil {

    //5-2
    //서버응답에 대한 실행할 인터페이스
    interface JsonResponseHeader {
        fun onResponse(json: JSONObject)
    }

    //변수+함수 객체를 이용하지않고 클래스 기능으로 활용
    companion object {

        val BASE_URL = "http://15.164.153.174" //호스트주소

        //4:postRequestLogin함수만들기 -> 5:로그인버튼
        fun postRequestLogin(id: String, pw: String, handler: JsonResponseHeader?) {
            val client = OkHttpClient() //클라언트동작
            val urlStr = "${BASE_URL}/user" //주소완성
            //파라미터(POST/PUT/PATCH) 값
            val formData = FormBody.Builder()
                .add("email", id)
                .add("password", pw)
                .build()
            //파라미터(POST/PUT/PATCH) 값 보내기
            val request = Request.Builder()
                .url(urlStr)
                .post(formData)
                .build()

            client.newCall(request).enqueue(object : Callback {
                //서버연결실패할경우
                override fun onFailure(call: Call, e: IOException) {

                }

                //서버연결성공할경우
                override fun onResponse(call: Call, response: Response) {

                    //서버가 보내준 본문
                    val bodyString = response.body!!.string()
                    //String -> jSON Object 변환
                    val json = JSONObject(bodyString)
                    Log.d("ServerUtil(서버응답본문)", json.toString())
                    //{"code":400,"message":"존재하지 않는 이메일입니다."}
                    //{"code":400,"message":"비밀번호가 틀립니다."}
                    //{"code":200,"message":"로그인 성공.","data":{"user":{...},"token":"..."}}
                    //if (handler != null) handler.onResponse(json)
                    handler?.onResponse(json)

                }

            })

        }

    }

}