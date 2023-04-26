package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class BookActionForward {
	// 이동방식, 페이지
	private boolean isRedirect;
	private String path;
	
	
	
}
