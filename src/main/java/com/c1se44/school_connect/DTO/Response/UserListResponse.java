package com.c1se44.school_connect.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserListResponse<T,D> {
	List<T> listResult1 =new ArrayList<>();
	List<D> listResult2 =new ArrayList<>();
}
