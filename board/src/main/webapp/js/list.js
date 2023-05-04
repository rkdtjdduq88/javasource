/**
 * 
 */

 // 검색버튼 클릭 시 검색기준 value, keyword 입력여부 확인
 const form = document.querySelector("form");
 form.addEventListener("submit",(e)=>{
	 e.preventDefault();
	 const criteria = document.querySelector("[name='criteria']");
	 const keyword = document.querySelector("[name='keyword']");	 
	 	 
	 if(criteria.value == "n"){
		 alert("검색 기준을 확인해 주세요");
		 criteria.focus();
		 return;
	 }else if(keyword.value == ""){
		 alert("검색어를 확인해 주세요");
		 keyword.focus();
		 return;
	 }
	 
	 form.submit();
 })