package pers.zhangshaoqun.sundries.api.message.request.location;

import pers.zhangshaoqun.sundries.api.message.request.BaseMessage;

/**
 * 地理位置消息
 */
public class LocationMessage extends BaseMessage {

  private String Location_X;
  private String Location_Y;
  private String Scale;
  private String Label;

  /** 地理位置纬度  */
  public String getLocation_X() {
    return Location_X;
  }

  public void setLocation_X(String location_X) {
    Location_X = location_X;
  }

  /** 地理位置经度  */
  public String getLocation_Y() {
    return Location_Y;
  }

  public void setLocation_Y(String location_Y) {
    Location_Y = location_Y;
  }

  /** 地图缩放大小  */
  public String getScale() {
    return Scale;
  }

  public void setScale(String scale) {
    Scale = scale;
  }

  /** 地理位置信息   */
  public String getLabel() {
    return Label;
  }

  public void setLabel(String label) {
    Label = label;
  }
}
