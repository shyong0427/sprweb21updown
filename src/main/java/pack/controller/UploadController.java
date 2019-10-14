package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UploadController {
	@Autowired
	private FileValidator fileValidator;

	@RequestMapping(value = "upload", method = RequestMethod.GET)
	public String getForm(@ModelAttribute("uploadfile") UploadFile uploadFile) {
		return "uploadform";
	}
}