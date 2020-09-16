package kr.co.tjoeun.daily10minutes_20200824

import androidx.appcompat.app.AppCompatActivity

/*
//1:Baseactivity(BaseActivity.kt) -> 2:로그인화면(activity_login.xml)
<!--//2:로그인화면 -> 3:로그인처리(LoginActivity.kt)-->
//3:로그인처리(okHttp:Manifest+build.gradle) -> 4:API통신모듈(ServerUtil.kt)
//4:API통신모듈(POST/GET/PUT) -> 5:API데이터(Context.kt)
//5:API데이터(setter,getter) -> 6:로그인버튼(LoginActivity.kt)
//6:로그인버튼 -> 7:회원가입(activity_sign_up.xml)
<!--//7:회원가입 -> 8:회원가입(SignUpActivity.kt) -->
//8:회원가입 -> 9:프로젝트목록(activity_main.xml)
<!--//9:프로젝트목록 -> 10:프로젝트목록(project_list_item.xml)-->
<!--//10:프로젝트목록(datas:Project.kt) -> 11:프로젝트목록(ProjectAdapter.kt)-->
//11:프로젝트목록어댑터(Glide) -> 12:프로젝트목록(MainActivity.kt)
//12:프로젝트목록(로그아웃) -> 13:스플래시화면(activity_splash.xml)
<!--//13:스플래시화면 -> 14:스플래시화면(SplashActivity.kt)-->
//14:스플래시화면(Manifest+자동로그인확인) -> 15:firebase-messaging 추가(build.gradle)
//15:firebase-messaging 추가 -> 16:MyFCMService firebase.MESSAGE_EVENT(AndroidMenifest.xml)
//16:MyFCMService firebase.MESSAGE_EVENT -> 17:MyFCMService(MyFCMService.kt)
//17:MyFCMService -> 18:프로젝트상세페이지(activity_view_project_detail.xml)
<!--//18:프로젝트상세페이지 -> 19:프로젝트상세페이지(ViewProjectDetailActivity.kt)-->
//19:프로젝트상세페이지 -> 20:RestAPI.프로젝트상세(ServerUtil.kt)
//20:RestAPI.프로젝트상세 -> 21:프로젝트상세.가져오기(ViewProjectDetailActivity.kt)
//21:프로젝트상세.가져오기 -> 22:프로젝트데이터넣기(Project.kt)
//22:프로젝트데이터넣기(Json) -> 23:프로젝트상세데이터처리(ViewProjectDetailActivity.kt)
//23:프로젝트상세데이터처리 -> 24:RestAPI.프로젝트등록(ServerUtil.kt)

//24:RestAPI.프로젝트등록 -> 25:프로젝트등록버튼(ViewProjectDetailActivity.kt)
//25:프로젝트등록버튼 -> 26:서버에서 보내준 프로젝트정보(mProject)를 새로 반영하는 기능(ViewProjectDetailActivity.kt)
*/

//STEP1:BaseActivity만들기
abstract class BaseActivity : AppCompatActivity() {
    val mContext = this
    abstract fun setupEvents()
    abstract fun setValues()
}