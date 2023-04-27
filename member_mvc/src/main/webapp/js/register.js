/**
 * 폼 모든 요소가 비어있는지 확인
 */
const form = document.querySelector("form");
form.addEventListener("submit",(e)=>{
	e.preventDefault
	const userid = document.querySelector("#userid");
	const password = document.querySelector("#password");
	const name = document.querySelector("#name");
	const gender = document.querySelector("#gender");
	const email = document.querySelector("#email");
	
	if(userid.value === ""){
		alert("아이디를 입력해 주세요")
		return;
	}else if(password.value === ""){
		alert("비밀번호를 입력해 주세요")
		return;
	}else if(name.value === ""){
		alert("이름을 입력해 주세요")
		return;
	}else if(gender.value === ""){
		alert("성별을 선택해 주세요")
		return;
	}else if(email.value === ""){
		alert("이메일을 입력해 주세요")
		return;
	}
		
	form.submit();
})