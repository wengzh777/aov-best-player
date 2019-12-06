package com.wzh.aovbputil.dto.result;


import com.github.pagehelper.Page;

/**
 * 通用返回工具
 * 
 * @author hzb
 * @version 2018年5月15日 上午10:14:37
 */
public class ResultHelper {

	public static <T> ResultVO<T> create(boolean success) {
		return new ResultVO<>(success);
	}

	public static <T> ResultVO<T> success() {
		return new ResultVO<>(true);
	}

	public static <T> ResultVO<T> success(T data) {
		return new ResultVO<>(true, data);
	}

	public static <T> ResultVO<T> success(String code, String msg) {
		return new ResultVO<>(true, code, msg, null);
	}

	public static <T> ResultVO<T> success(T data,String sessionId) {
		return success(ResultCodeEnum.SUCCESS, data ,sessionId);
	}
	
	public static <T> ResultVO<T> success(ResultCodeEnum e, T data, String sessionId) {
		return new ResultVO<T>(true, e.getCode(), e.getMessage(), data, sessionId);
	}
	
	public static <T> ResultVO<T> success(String code, String msg, T data) {
		return new ResultVO<>(true, code, msg, data);
	}

	public static <T> ResultVO<T> fail() {
		return new ResultVO<>(false);
	}

	public static <T> ResultVO<T> fail(String code, String msg) {
		return new ResultVO<>(false, code, msg, null);
	}

	public static <T> ResultVO<T> fail(String code) {
		return new ResultVO<>(false, code, null, null);
	}

	public static <T> ResultVO<T> fail(ResultCodeEnum e) {
		return new ResultVO<T>(false, e.getCode(), e.getMessage(), null);
	}

	public static <T> ResultVO<T> fail(ResultCodeEnum e, T data) {
		return new ResultVO<T>(false, e.getCode(), e.getMessage(), data);
	}
	public static <T> ResultVO<T> fail(String code, String msg, T data,String sessionId) {
		return new ResultVO<>(false, code, msg, data,sessionId);
	}
	
	public static <T> ResultVO<T> fail(ResultVO resultVO) {
		return new ResultVO<T>(false, resultVO.getResultCode(), resultVO.getErrorMessage(), null);
	}

	public static <T> ResultVO<T> error(String msg) {
		return new ResultVO<T>(false, ResultCodeEnum.ERROR.getCode(), msg, null);
	}

	public static <T> ResultVO<T> error(Exception e) {
		return new ResultVO<T>(false, ResultCodeEnum.ERROR.getCode(), e.getMessage(), null);
	}

	public static <T> ResultVO<PageResult<T>> page(Page<T> list){
		PageResult<T> result = new PageResult<>(list);
		return success(result);
	}

}
