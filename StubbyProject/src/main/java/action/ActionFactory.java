package action;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	private ActionFactory() {}
	public static ActionFactory getInstance() {
		return instance;
	}
		public Action getAction(String command) {
			Action action = null;
			switch(command) {
//					메인페이지
			case "MainPage" : action = new MainPageSearchAction(); break;
/*로그인*/		case "login" : action = new LoginAction(); break;
/*네이버소셜로그인*/	case "LoginNaverAction" : action = new LoginNaverAction(); break;
/*로그아웃*/		case "logout" : action = new LogoutAction(); break;
/*중복 아이디체크*/	case "checkid" : action = new RepetitionCheckId(); break;
/*회원가입*/		case "signup" : action = new SignUpUser(); break;
/*비밀번호찾기/변경*/	case "ChangePw" : action = new ChangePwAction(); break;
//					탐색페이지
/*탐색 메인페이지*/	case "natlist" : action = new NatListAction(); break;
/*도시좋아요*/		case "cityLikeBtn" : action = new cityLikeBtnAction(); break;
//				 	숙소페이지 
/*호텔 메인페이지*/	case "HotelMain" : action = new HotelMainAction(); break;									 
/*호텔 서브페이지*/	case "HotelSub" : action = new HotelSubAction(); break;		
/*호텔 숙소필터링*/	case "HotelOrder" : action = new HotelOrderAction(); break;		
/*숙소 페이징*/		case "HotelCount" : action = new HotelCountAction(); break;		
/*숙소 리뷰페이지*/	case "HrInfiniteScroll" : action = new HrInfiniteScrollAction(); break;		
/*숙소 리뷰상세페이지*/	case "hotelReviewDetail" : action = new HrDetailDataAction(); break;			
/*숙소 리뷰글쓰기*/	case "HrReviewWrite" : action = new HrReviewWrite(); break;							 
/*숙소 리뷰수정하기*/	case "HrReviewReform" : action = new HrReviewReform(); break;							
/*숙소 리뷰삭제하기*/	case "HrReviewDelete" : action = new HrReviewDelete(); break;	
/*숙소 리뷰댓글작성*/	case "HrCommentWrite" : action = new HrCommentWrite(); break;							
/*숙소 리뷰댓글삭제*/	case "HrCommentDelete" : action = new HrCommentDelete(); break; 					
/*숙소 리뷰댓글수정*/	case "HrCommentUpdate" : action = new HrCommentUpdate(); break; 					
//					여행기페이지(게시판)
/*게시물전체 조회*/	case "diary" : action = new DiaryListAction(); break;
/*게시물상세페이지*/	case "diarydetail" : action = new DiaryDetailAction(); break;
/*게시물 좋아요*/		case "diarylike" : action = new DiaryLikeAction(); break;
/*게시물 삭제*/		case "diarydelete" : action = new DiaryDeleteAction(); break;
/*게시물 작성*/		case "adddiary" : action = new AddDiaryAction(); break;
/*댓글추가*/		case "addcmt" : action = new AddCmtAction(); break;
/*댓글삭제*/		case "deletecmt" : action = new DeleteCmtAction(); break;
/*댓글수정*/		case "updatecmt" : action = new UpdateCmtAction(); break;
//					플래너페이지(여행일정)					
/*플래너 일정짜기*/	case "planstart" : action = new PlanStartAction(); break;
/*플래너 일정저장*/	case "setmyplan" : action = new SetMyPlanAction(); break;
//					마이페이지
/*마이페이지 조회*/	case "mypage" : action = new MyPageAction(); break;
/*나의 일정조회,수정*/	case "planmodify" : action = new PlanModifyAction(); break;
/*나의 일정이름변경*/	case "planrename" : action = new SetMyPlanNameAction(); break;
/*나의 일정삭제*/	case "plandelete" : action = new DeleteMyPlanAction(); break;
/*찜한여행 삭제*/	case "deletetourlike" : action = new DeleteTourLikeAction(); break;
/*유저패스워드확인*/	case "checkuser" : action = new CheckUserAction(); break;
/*유저 정보변경*/	case "changeuserinfo" : action = new ChangeUserInfoAction(); break;
/*유저 회원탈퇴*/	case "deletemember" : action = new DeleteMemberAction(); break;
			}
			return action;
		}
}
