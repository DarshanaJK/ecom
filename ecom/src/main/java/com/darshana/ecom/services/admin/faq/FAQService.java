package com.darshana.ecom.services.admin.faq;

import com.darshana.ecom.dto.FAQDto;

public interface FAQService {

    FAQDto postFAQ(Long productId, FAQDto faqDto);
}
