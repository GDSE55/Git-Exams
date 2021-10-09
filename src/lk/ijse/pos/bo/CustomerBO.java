/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE55-Exam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */


package lk.ijse.pos.bo;

import lk.ijse.pos.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerBO extends SuperBO{
    boolean addCustomer(CustomerDTO customer) throws Exception;

    boolean deleteCustomer(String id) throws Exception;

    boolean updateCustomer(CustomerDTO customer) throws Exception;

    CustomerDTO searchCustomer(String id) throws Exception;

    ArrayList<CustomerDTO> getAllCustomers() throws Exception;
}
