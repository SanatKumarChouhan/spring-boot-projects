package com.rays.ctl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PolicyHolderDTO;
import com.rays.form.PolicyHolderForm;
import com.rays.form.UserForm;
import com.rays.service.PolicyHolderService;
import com.rays.service.UserService;

@RestController
@RequestMapping(value = "PolicyHolder")
public class PolicyHolderCtl extends BaseCtl{
	
	
	@Autowired
	public PolicyHolderService policyHolderService;
	
	@PostMapping("save")
	public ORSResponse save(@RequestBody @Valid PolicyHolderForm form, BindingResult bindingResult) {

		ORSResponse res = validate(bindingResult);

		if (!res.isSuccess()) {
			return res;
		}

		PolicyHolderDTO dto = (PolicyHolderDTO) form.getDto();

		if (dto.getId() != null && dto.getId() > 0) {
			policyHolderService.update(dto);
			res.addData(dto.getId());
			res.addMessage("Data Updated Successfully..!!");
		} else {
			long pk = policyHolderService.add(dto);
			res.addData(pk);
			res.addMessage("Data added Successfully..!!");
		}
		return res;
	}
	
	@GetMapping("delete/{ids}")
	public ORSResponse delete(@PathVariable long[] ids) {

		ORSResponse res = new ORSResponse();

		for (long id : ids) {
			policyHolderService.delete(id);
		}

		res.addMessage("data deleted successfully");

		return res;
	}
	
}
