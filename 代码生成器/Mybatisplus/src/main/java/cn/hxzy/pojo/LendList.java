package cn.hxzy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author shujun.Meng
 * @since 2022-04-30
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
@ApiModel(value="LendList对象", description="")
public class LendList implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "ser_num", type = IdType.AUTO)
      private Long serNum;

    private Long bookId;

    private Long readerId;

    private Date lendDate;

    private Date backDate;


}
