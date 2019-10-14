package pack.controller;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile { // File 처리용 dto
	private MultipartFile multipartFile;

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
}